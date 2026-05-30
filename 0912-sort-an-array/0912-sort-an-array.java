class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums, int l, int r){
        if(l>=r)return;
        int m = l+(r-l)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m,r);

    }
    public void merge(int[] nums, int l, int m, int r){
        List<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m+1;
        while(left<=m && right<=r){
            if(nums[left]<=nums[right]){
            temp.add(nums[left]);
            left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=m){
            temp.add(nums[left]);
            left++;
        }
        while(right<=r){
                temp.add(nums[right]);
                right++;
                    }
        for(int i = l ; i <=r ; i++){
            nums[i]=temp.get(i-l);
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
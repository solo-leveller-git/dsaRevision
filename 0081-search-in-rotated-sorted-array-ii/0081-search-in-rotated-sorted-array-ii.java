class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==1)return nums[0]==target;
        int i = 0;
        while(i<nums.length-1 && nums[i]==nums[nums.length-1])i++;
        int end = nums.length-1;
        while(i<=end){
            int mid = i+(end-i)/2;
            if(nums[mid]==target)return true;
            else if(nums[mid]>=nums[i]){
                if(target==nums[i])return true;
                else if(target>nums[i] && target<nums[mid])end=mid-1;
                else i=mid+1;
            }
            else{
                if(target==nums[end])return true;
                else if(target>nums[mid] && target<nums[end])i=mid+1;
                else end=mid-1;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
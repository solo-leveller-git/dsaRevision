class Solution {
    int ans;
    public int reversePairs(int[] arr) {
        ans =0;
        sort(arr,0,arr.length-1);
        return ans;
    }
    void sort(int[] arr, int l, int r){
        if(l>=r)return;
        int m = l+(r-l)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        int nx = m+1;

for (int i = l; i <= m; i++) {
    while (nx <= r && (long)arr[i] > 2L * arr[nx]) {
        nx++;
    }
    ans += nx - (m + 1);
}
        merge(arr,l,m,r);

    }
    void merge(int[] arr,int l,int m,int r){
          int left = l;
        int right = m+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=m){
                temp.add(arr[left]);
                left++;
        }
        while(right<=r){
                temp.add(arr[right]);
                right++;
        }
        for(int i = l ; i <= r ; i++){
            arr[i]=temp.get(i-l);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
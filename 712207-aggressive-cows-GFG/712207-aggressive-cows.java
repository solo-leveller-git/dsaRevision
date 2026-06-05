class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length-1]-stalls[0];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(cow(stalls,mid)<k)end = mid-1;
            else start = mid+1;
        }
        return end;
    }
    public int cow(int[] arr, int dis){
        int ret = 1;
        int placed = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]-arr[placed]>=dis){
                placed=i;
                ret++;
            }
        }
        return ret;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
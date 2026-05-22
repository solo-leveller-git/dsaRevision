class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
     int start=intervals[0][0];
     int end=intervals[0][1];
     int ans = 0;
     for(int i = 1 ; i < intervals.length ; i++){
        if(intervals[i][0]<end){
            ans++;
            end = Math.min(end, intervals[i][1]);
            if(intervals[i][1]>end){
                continue;
            }
            }
            else{
                 start=intervals[i][0];
                end=intervals[i][1];
            }
     }
     return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
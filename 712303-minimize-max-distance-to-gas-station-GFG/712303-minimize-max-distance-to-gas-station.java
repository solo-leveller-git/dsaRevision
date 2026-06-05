class Solution {
    public double minMaxDist(int[] stations, int K) {
        double start = 0;
        double end = 1e6;
        while(end - start > 1e-6){
            double mid = start+(end-start)/2;
            if(helper(stations,mid,K))end=mid;
            else start = mid;
        }
        return start;
    }
    public boolean helper(int[] arr, double dis, int gas){
        int count = 0;
        for(int i = 1 ; i < arr.length ; i++){
            double gap = arr[i]-arr[i-1];
            int ng = (int)Math.ceil(gap/dis);
            count+=ng-1;
        }
        if(count>gas)return false;
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
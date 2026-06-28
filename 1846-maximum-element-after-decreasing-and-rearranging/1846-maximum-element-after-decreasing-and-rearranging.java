class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        arr[0]=1;
        for(int i = 1 ; i < arr.length ; i++){
            if(Math.abs(arr[i]-arr[i-1])<=1)continue;
            else{
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
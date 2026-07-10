class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int f = -1;
        int s = -1;
        for(int n:arr){
            if(n>f){
                s=f;
                f=n;
            }
            else if(n!=f){
                s=Math.max(s,n);
            }
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
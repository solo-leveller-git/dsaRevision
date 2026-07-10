class Solution {
    public int nthFibonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int t = b;
            b=a+b;
            a=t;
        }
        return b;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
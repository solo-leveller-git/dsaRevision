class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum = 0 ;
        for(int i = 1 ; i*i<=n ; i++){
            if(n%i==0){
                sum+=i;
                if(i!=1 && i*i!=n)sum+=n/i;
            }
            
        }
        return sum==n;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
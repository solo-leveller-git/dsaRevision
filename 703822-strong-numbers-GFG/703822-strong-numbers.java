class Solution {
    public boolean isStrong(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            sum+=fact(rem);
            temp/=10;
        }
        return sum==n;
    }
    public int fact(int x){
        int ans = 1;
        while(x>0){
            ans*=x;
            x-=1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
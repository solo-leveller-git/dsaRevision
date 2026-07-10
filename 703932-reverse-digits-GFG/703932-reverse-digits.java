class Solution {
    public int reverseDigits(int n) {
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
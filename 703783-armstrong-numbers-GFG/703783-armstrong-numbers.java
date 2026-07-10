class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int check = 0;
        int nt = n;
        while(nt>0){
            int rem = nt%10;
            check+=(rem*rem*rem);
            nt/=10;
        }
        return n==check;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
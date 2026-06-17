class Solution {
    public static int findXOR(int l, int r) {
        int right = chk(r);
        int left = chk(l-1);
        return left^right;
        
    }
    public static int chk(int n){
       if(n % 4 == 0) return n;
else if(n % 4 == 1) return 1;
else if(n % 4 == 2 )return n + 1;
else return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
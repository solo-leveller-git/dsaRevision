class Solution {
    public int gcdOfOddEvenSums(int n) {
        int lo = n*2-1;
        int le = n*2;
        int so=1;
        int se=2;
        int sumOdd = (int)((n/2.0)*((2*so)+(n-1)*2));
        int sumEven = (int)((n/2.0)*((2*se)+(n-1)*2));
        while(sumEven%sumOdd!=0){
            int t = sumEven;
            sumOdd=sumEven%sumOdd;
            sumEven=t;
        }
        return sumOdd;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
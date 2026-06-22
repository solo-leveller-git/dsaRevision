class Solution {
    public int maxNumberOfBalloons(String text) {
        int B = 0;
        int A = 0;
        int L = 0;
        int O = 0;
        int N = 0;
        for(char ch:text.toCharArray()){
            if(ch=='b')B++;
            else if(ch=='a')A++;
            else if(ch=='l')L++;
            else if(ch=='o')O++;
            else if(ch=='n')N++;
        }
        O/=2;
        L/=2;
        return Math.min(B,Math.min(A,Math.min(L,Math.min(O,N))));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
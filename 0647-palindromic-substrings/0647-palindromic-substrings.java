class Solution {
    public int countSubstrings(String s) {
        Boolean[][] dp = new Boolean[s.length()][s.length()];

        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(isPal(s,i,j,dp)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPal(String s, int i, int j, Boolean[][] dp){
        if(i>=j)return true;
        if(dp[i][j]!=null)return dp[i][j];
        if(s.charAt(i)!=s.charAt(j))return false;
        return isPal(s,i+1,j-1,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
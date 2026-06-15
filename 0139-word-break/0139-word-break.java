class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()+1];

        return helper(s,wordDict,0,dp);
    }
    public boolean helper(String s, List<String> dict, int i,Boolean[] dp){
        if(i>=s.length())return dp[i]=true;
        if(dp[i]!=null)return dp[i];
        for(int j = i ; j < s.length() ; j++){
            if(dict.contains(s.substring(i,j+1))){
                if(helper(s,dict,j+1,dp))return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int[][] dp = new int[nums.length+1][target+1];
        for(int[] r:dp)Arrays.fill(r,-1);
        return rec(0,nums,target,dp);
        
    }
    public int rec(int i, int[] nums, int target, int[][] dp){
        if(i>=nums.length){
            if(target==0)return 1;
            return 0;
        }
        if(dp[i][target]!=-1)return dp[i][target];
        int pick=0;
        if(target-nums[i]>=0)
        pick = rec(i+1,nums,target-nums[i],dp);
        int npick = rec(i+1,nums,target,dp);
        return dp[i][target]=pick+npick;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
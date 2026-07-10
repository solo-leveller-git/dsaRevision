class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int pre=0, res = 0;
        for(int i = 0 ; i < nums.length-k ; i++){
            pre=Math.max(pre,nums[i]);
            res=Math.max(res,pre+nums[i+k]);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
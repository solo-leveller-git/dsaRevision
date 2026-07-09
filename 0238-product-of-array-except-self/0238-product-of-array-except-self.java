class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = nums[0];
        int suf = nums[nums.length-1];
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        for(int i = 1 ; i < nums.length ; i++){
            
            ans[i]=pre;
            pre*=nums[i];
        }
        for(int i = nums.length-2 ; i >= 0 ; i--){
            
            ans[i]*=suf;
            suf*=nums[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
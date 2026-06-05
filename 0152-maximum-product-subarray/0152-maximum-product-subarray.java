class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)return nums[0];
        int ltor = 0;
        int  ans = 0;
        for(int i  =0 ; i < nums.length ; i++){
            if(ltor==0)ltor=1;
            ltor*=nums[i];
            ans=Math.max(ans,ltor);
        }
        int rtol  = 0;
        for(int i  = nums.length-1 ; i >=0 ; i--){
            if(rtol==0)rtol=1;
            rtol*=nums[i];
            ans=Math.max(ans,rtol);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
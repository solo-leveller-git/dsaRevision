class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int c = k;
        int ans = 0;
        while(r<nums.length){
            while(nums[r]==0 && c<=0 && l<=r){
                if(nums[l]==0)c++;
                l++;
            }
            if(nums[r]==0)c--;
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
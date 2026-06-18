class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(l<=r){
            if(lmax<rmax){
                if(height[l]<lmax){
                    ans+=lmax-height[l];
                }
                lmax=Math.max(lmax,height[l]);
                l++;
            }
            else{
                if(height[r]<rmax){
                    ans+=rmax-height[r];
                }
                rmax=Math.max(rmax,height[r]);
                r--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
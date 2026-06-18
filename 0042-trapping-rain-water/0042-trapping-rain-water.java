class Solution {
    public int trap(int[] height) {
        int[] right = new int[height.length];
        int[] left = new int[height.length];
        int rmax = 0;
        for(int i = right.length-1 ; i >= 0 ; i--){
            right[i]=rmax;
            rmax = Math.max(rmax,height[i]);
        }
        int lmax = 0;
        for(int i = 0 ; i < left.length ; i++){
            left[i]=lmax;
            lmax = Math.max(lmax,height[i]);
        }
        int ans = 0;
        for(int i = 0 ; i < height.length ; i++){
            int min = Math.min(left[i],right[i]);
            if(height[i]<min)ans+=(min-height[i]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
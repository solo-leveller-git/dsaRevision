class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int x = nums.length/2;
        int n = nums[x];
        int c = 0;
        for(int y:nums){
            if(y==n)c++;
        }
        return c==1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
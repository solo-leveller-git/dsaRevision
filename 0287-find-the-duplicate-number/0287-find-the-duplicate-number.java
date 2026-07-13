class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length ; i++){
            if(nums[i-1]==nums[i])return nums[i];
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
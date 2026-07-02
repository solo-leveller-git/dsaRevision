class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1 )return false;
        Arrays.sort(nums);
    
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1]==nums[i])return true;
        }
        return false;
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
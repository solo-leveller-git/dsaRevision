class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for(int r = 0 ; r < nums.length ; r++){
            while(l<r && nums[l]!=0)l++;
            if(nums[l]==0 && nums[r]!=0){
                nums[l]=nums[r];
                nums[r]=0;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
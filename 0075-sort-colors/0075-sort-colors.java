class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int it = 0;
        int r = nums.length-1;
        while(it<=r){
            if(nums[it]==0){
                nums[it]=nums[l];
                nums[l]=0;
                l++;
                it++;
            }
            else if(nums[it]==2){
                nums[it]=nums[r];
                nums[r]=2;
                r--;
            }
            else
            it++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
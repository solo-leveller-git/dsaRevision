class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int fh = nums.length-k-1;
        reverse(nums,0,fh);
        reverse(nums,fh+1,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] nums, int l, int r){
        while(l<=r){
            int t = nums[r];
            nums[r]=nums[l];
            nums[l]=t;
            l++;
            r--;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
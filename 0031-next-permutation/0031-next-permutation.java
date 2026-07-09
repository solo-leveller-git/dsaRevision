class Solution {
    public void nextPermutation(int[] nums) {
        int r = nums.length - 1;

        while (r > 0 && nums[r - 1] >= nums[r]) {
            r--;
        }

        if (r == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        int pivot = r - 1;

        int j = nums.length - 1;
        while (nums[j] <= nums[pivot]) {
            j--;
        }

        int temp = nums[pivot];
        nums[pivot] = nums[j];
        nums[j] = temp;
        reverse(nums, r, nums.length - 1);
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
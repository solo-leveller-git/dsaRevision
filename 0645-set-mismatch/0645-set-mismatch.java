class Solution {
    public int[] findErrorNums(int[] nums) {
        int totalXor = 0;

        for (int n : nums) totalXor ^= n;
        for (int i = 1; i <= nums.length; i++) totalXor ^= i;

        int set = totalXor & -totalXor;

        int x = 0, y = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & set) != 0) y ^= nums[i];
            else x ^= nums[i];

            if (((i + 1) & set) != 0) y ^= (i + 1);
            else x ^= (i + 1);
        }

        for (int n : nums) {
            if (n == x) {
                return new int[]{x, y};
            }
        }

        return new int[]{y, x}; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
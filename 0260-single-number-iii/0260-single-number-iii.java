class Solution {

    public int[] singleNumber(int[] nums) {

        int totalXor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            totalXor ^= nums[i];
        }

        int j = 0;

        while (((totalXor >> j) & 1) != 1) {
            j++;
        }

        int first = 0;
        int second = 0;

        for (int n : nums) {

            if (((n >> j) & 1) == 0) {
                first ^= n;
            } else {
                second ^= n;
            }
        }

        return new int[]{first, second};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
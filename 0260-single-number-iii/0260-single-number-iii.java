class Solution {

    public int[] singleNumber(int[] nums) {

        int xor = 0;

        for (int n : nums) {
            xor ^= n;
        }

        // rightmost set bit
        int mask = xor & -xor;

        int first = 0;
        int second = 0;

        for (int n : nums) {

            if ((n & mask) == 0) {
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
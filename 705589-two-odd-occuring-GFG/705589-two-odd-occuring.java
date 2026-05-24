class Solution {

    ArrayList<Integer> twoOddNum(int[] arr) {

        int xor = 0;

        for (int n : arr) {
            xor ^= n;
        }

        int mask = xor & -xor;

        int first = 0;
        int second = 0;

        for (int n : arr) {

            if ((n & mask) == 0) {
                first ^= n;
            } else {
                second ^= n;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (first > second) {
            ans.add(first);
            ans.add(second);
        } else {
            ans.add(second);
            ans.add(first);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
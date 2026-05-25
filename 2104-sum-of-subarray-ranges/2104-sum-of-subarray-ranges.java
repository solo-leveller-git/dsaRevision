class Solution {

    public long subArrayRanges(int[] nums) {

        int n = nums.length;

        long minSum = 0;
        long maxSum = 0;

        Stack<Integer> st = new Stack<>();

        // ---------- MINIMUM CONTRIBUTION ----------

        for (int i = 0; i <= n; i++) {

            while (!st.isEmpty() &&
                  (i == n || nums[st.peek()] >= nums[i])) {

                int mid = st.pop();

                int left;

                if (st.isEmpty()) {
                    left = -1;
                } else {
                    left = st.peek();
                }

                int right = i;

                long leftCount = mid - left;
                long rightCount = right - mid;

                minSum += (long) nums[mid] * leftCount * rightCount;
            }

            st.push(i);
        }

        st.clear();

        // ---------- MAXIMUM CONTRIBUTION ----------

        for (int i = 0; i <= n; i++) {

            while (!st.isEmpty() &&
                  (i == n || nums[st.peek()] <= nums[i])) {

                int mid = st.pop();

                int left;

                if (st.isEmpty()) {
                    left = -1;
                } else {
                    left = st.peek();
                }

                int right = i;

                long leftCount = mid - left;
                long rightCount = right - mid;

                maxSum += (long) nums[mid] * leftCount * rightCount;
            }

            st.push(i);
        }

        return maxSum - minSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
class Solution {

    public long subArrayRanges(int[] nums) {
        return sumOfMax(nums) - sumOfMin(nums);
    }

    private long sumOfMax(int[] arr) {
        Stack<long[]> st = new Stack<>();
        long ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= arr[(int) st.peek()[0]]) {
                ans += st.pop()[1];
            }

            if (st.isEmpty()) {
                st.push(new long[]{i, (long) arr[i] * (arr.length - i)});
            } else {
                st.push(new long[]{
                    i,
                    st.peek()[1] + (long) arr[i] * (((int) st.peek()[0] - i))
                });
            }
        }

        while (!st.isEmpty()) ans += st.pop()[1];

        return ans;
    }

    private long sumOfMin(int[] arr) {
        Stack<long[]> st = new Stack<>();
        long ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[(int) st.peek()[0]]) {
                ans += st.pop()[1];
            }

            if (st.isEmpty()) {
                st.push(new long[]{i, (long) arr[i] * (arr.length - i)});
            } else {
                st.push(new long[]{
                    i,
                    st.peek()[1] + (long) arr[i] * (((int) st.peek()[0] - i))
                });
            }
        }

        while (!st.isEmpty()) ans += st.pop()[1];

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
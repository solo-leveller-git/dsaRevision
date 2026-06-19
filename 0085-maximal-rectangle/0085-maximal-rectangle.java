class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] heights = new int[n][m];

        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == '0') {
                    sum = 0;
                } else {
                    sum++;
                }
                heights[i][j] = sum;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, helper(i, heights));
        }

        return ans;
    }

    public int helper(int row, int[][] heights) {
        int m = heights[0].length;

        int[] pse = new int[m];
        int[] nse = new int[m];

        Arrays.fill(pse, -1);
        Arrays.fill(nse, m);

        Stack<Integer> st = new Stack<>();
        for (int j = 0; j < m; j++) {
            while (!st.isEmpty() &&
                   heights[row][j] < heights[row][st.peek()]) {
                nse[st.pop()] = j;
            }
            st.push(j);
        }

        st.clear();

        for (int j = m - 1; j >= 0; j--) {
            while (!st.isEmpty() &&
                   heights[row][j] < heights[row][st.peek()]) {
                pse[st.pop()] = j;
            }
            st.push(j);
        }

        int ans = 0;

        for (int j = 0; j < m; j++) {
            ans = Math.max(
                ans,
                (nse[j] - pse[j] - 1) * heights[row][j]
            );
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
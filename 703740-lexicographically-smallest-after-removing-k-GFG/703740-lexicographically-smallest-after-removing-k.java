class Solution {
    public String lexicographicallySmallest(String s, int k) {
        int n = s.length();

        long ops = k;

        if ((n & (n - 1)) == 0) {
            ops /= 2;
        } else {
            ops *= 2L;
        }

        if (ops >= n) return "-1";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);

            while (!st.isEmpty() && ops > 0 && curr < st.peek()) {
                st.pop();
                ops--;
            }

            st.push(curr);
        }

        while (ops > 0 && !st.isEmpty()) {
            st.pop();
            ops--;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
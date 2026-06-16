class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        int xor = 0;

        for (int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0];
            int val = queries[i][1];

            if (type == 0) {
                ans.add(val ^ xor);
            } else {
                xor ^= val;
            }
        }

        ans.add(xor); 
        Collections.sort(ans);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
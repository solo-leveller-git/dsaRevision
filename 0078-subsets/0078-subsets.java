class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int n = 1 << nums.length;   

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    l.add(nums[j]);
                }
            }

            ans.add(l);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
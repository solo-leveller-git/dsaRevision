class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : freq.keySet()) {
            int f = freq.get(num);

            if (bucket[f] == null)
                bucket[f] = new ArrayList<>();

            bucket[f].add(num);
        }

        int[] ans = new int[k];
        int idx = 0;

        for (int i = nums.length; i >= 1 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    ans[idx++] = num;
                    if (idx == k)
                        break;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
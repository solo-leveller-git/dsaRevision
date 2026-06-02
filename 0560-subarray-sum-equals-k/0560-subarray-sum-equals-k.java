class Solution {
    public int subarraySum(int[] arr, int k) {

        int n = arr.length;
        int[] pre = new int[n];

        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int ans = 0;

        for (int i = 0; i < n; i++) {

            ans += map.getOrDefault(pre[i] - k, 0);

            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
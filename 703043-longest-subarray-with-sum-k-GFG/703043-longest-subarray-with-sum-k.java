class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        map.put(arr[0], 0);

        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];

            if (!map.containsKey(pre[i])) {
                map.put(pre[i], i);
            }
        }

        int ans = 0;

for (int i = 0; i < arr.length; i++) {
    int difference = pre[i] - k;

    if (pre[i] == k) {    
        ans = Math.max(ans, i + 1);
    }

    if (map.containsKey(difference)) {
        int idx = map.get(difference);
        ans = Math.max(ans, i - idx);
    }
}

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
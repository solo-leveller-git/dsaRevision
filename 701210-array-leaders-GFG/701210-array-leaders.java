class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int check = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                ans.add(arr[i]);
            } else {
                if (arr[i] >= check) {
                    check = arr[i];
                    ans.add(check);
                }
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
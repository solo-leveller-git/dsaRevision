class Solution {
    List<Integer> seq = new ArrayList<>();

    public List<Integer> sequentialDigits(int low, int high) {
        int i = 2;
        while (i <= 9) {
            int fdigit = 10 - i;
            for (int k = 1; k <= fdigit; k++) {
                make(k, i);
            }
            i++;
        }
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : seq) {
            if(num>=low && num<=high)ans.add(num);
        }
        return ans;
    }

    public void make(int k, int i) {
        int num = 0;
        int x = k;
        while (x < i + k) {
            num = num * 10 + x;
            x++;
        }
        seq.add(num);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
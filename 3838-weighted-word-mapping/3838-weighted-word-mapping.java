class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            int weight = 0;

            for (char ch : word.toCharArray()) {
                weight = (weight + weights[ch - 'a']) % 26;
            }

            char add = (char) ('a' + (26 - weight-1));
            ans.append(add);
        }

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
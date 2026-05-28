class Solution {

    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = new int[combined.length()];

        int len = 0;
        int i = 1;

        while (i < combined.length()) {

            if (combined.charAt(i) == combined.charAt(len)) {

                len++;
                lps[i] = len;
                i++;
            }
            else {

                if (len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int palindromeLength = lps[combined.length() - 1];
        String remaining = s.substring(palindromeLength);
        String add = new StringBuilder(remaining).reverse().toString();

        return add + s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
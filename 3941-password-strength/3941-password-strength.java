class Solution {
    public int passwordStrength(String password) {

        int ans = 0;

        int[] nm = new int[10];
        int[] lower = new int[26];
        int[] upper = new int[26];

        Set<Character> symbols = new HashSet<>();

        symbols.add('!');
        symbols.add('@');
        symbols.add('#');
        symbols.add('$');

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {

                if (nm[ch - '0'] == 0) {
                    ans += 3;
                    nm[ch - '0'] = 1;
                }

            } 
            else if (Character.isLetter(ch)) {

                if (Character.isLowerCase(ch)) {

                    if (lower[ch - 'a'] == 0) {
                        ans += 1;
                        lower[ch - 'a'] = 1;
                    }

                } else {

                    if (upper[ch - 'A'] == 0) {
                        ans += 2;
                        upper[ch - 'A'] = 1;
                    }
                }

            } 
            else {

                if (symbols.contains(ch)) {
                    ans += 5;
                    symbols.remove(ch);
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
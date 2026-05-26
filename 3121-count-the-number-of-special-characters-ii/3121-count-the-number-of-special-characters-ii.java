class Solution {
    public int numberOfSpecialChars(String word) {

        int[] lower = new int[26];
        int[] upper = new int[26];
        Arrays.fill(lower,-1);
        Arrays.fill(upper,-1);
        int i = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = i;
            }
            else {
               
                if(upper[ch - 'A']==-1)
                upper[ch - 'A'] = i;
            }
            i++;
        }

        int count = 0;
        for ( i = 0; i < 26; i++) {

            if (lower[i]!=-1 && upper[i]!=-1) {
                if(lower[i]<upper[i])
                count++;
            }
        }

        return count;
    }
}
    

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
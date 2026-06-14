class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        int i = 0, j = 0;
        String s = "r";

        while (true) {

            if (i < 0) return Arrays.asList(i + 1, j);
            if (i >= mat.length) return Arrays.asList(i - 1, j);
            if (j < 0) return Arrays.asList(i, j + 1);
            if (j >= mat[0].length) return Arrays.asList(i, j - 1);

            if (mat[i][j] == 1) {
                if (s.equals("r")) {
                    s = "d";
                } else if (s.equals("d")) {
                    s = "l";
                } else if (s.equals("l")) {
                    s = "u";
                } else {
                    s = "r";
                }
            }

            if (s.equals("r")) {
                mat[i][j]=0;
                j++;
            } else if (s.equals("d")) {
                mat[i][j]=0;
                i++;
            } else if (s.equals("l")) {
                mat[i][j]=0;
                j--;
            } else {
                
                mat[i][j]=0;
                i--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length-1 ; i++){
            for(int j = i+1 ; j < matrix[0].length ; j++){
                int t = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int[] r:matrix){
            reverse(r);
        }
    }
    public void reverse(int[] r){
        int i = 0;
        int j = r.length-1;
        while(i<=j){
            int t = r[i];
            r[i] = r[j];
            r[j] = t;
            i++;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
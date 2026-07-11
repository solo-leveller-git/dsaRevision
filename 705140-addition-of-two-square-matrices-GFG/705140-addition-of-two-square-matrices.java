class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        for(int i = 0 ; i < matrixA.length ; i++){
            for(int j = 0 ; j < matrixA.length ; j++){
                matrixA[i][j]+=matrixB[i][j];
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
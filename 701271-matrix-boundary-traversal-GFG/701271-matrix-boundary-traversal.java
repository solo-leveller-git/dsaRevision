class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;
        for(int i = left ; i <= right ; i++)ans.add(mat[top][i]);
        top++;
        for(int i = top ; i<= bottom ; i++)ans.add(mat[i][right]);
        right--;
        if(left<=right && top<=bottom)
        for(int i = right ; i>=left ; i--)ans.add(mat[bottom][i]);
        bottom--;
        if(left<=right && top<=bottom)
        for(int i = bottom ; i>=top ; i--)ans.add(mat[i][left]);
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
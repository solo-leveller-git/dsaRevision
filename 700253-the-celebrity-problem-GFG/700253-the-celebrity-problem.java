class Solution {
    public int celebrity(int mat[][]) {
        // code here
     int l = 0;
     int e = mat.length-1;
     while(l<e){
         if(mat[l][e]==1)l++;
         else e--;
     }
     for(int i = 0 ; i < mat[0].length ; i++){
         if(mat[i][l]==0)return -1;
     }
     for(int i = 0 ; i < mat[0].length ; i++){
         if(i!=l)
         if(mat[l][i]==1)return -1;
     }
     return e;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
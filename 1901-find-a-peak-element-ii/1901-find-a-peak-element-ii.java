class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int start = 0;
        int end = mat[0].length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for(int i = 0 ; i < mat.length ; i++){
                if(mat[i][mid]>max){
                    max=mat[i][mid];
                    idx=i;
                }

            }
            int left = (mid-1<0)?-1:mat[idx][mid-1];
            int right = (mid+1>=mat[0].length)?-1:mat[idx][mid+1];
            if(max>left && max>right)return new int[]{idx,mid};
            else if(left>max)end=mid-1;
            else start  = mid+1;
        }
        return new int[]{-1,-1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
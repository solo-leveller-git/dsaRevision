class Solution {
    public int median(int[][] mat) {
        int start=Integer.MAX_VALUE;
        int end=-1;
        for(int i = 0 ; i < mat.length ; i++){
            start=Math.min(start,mat[i][0]);
            end=Math.max(end,mat[i][mat[0].length-1]);
        }
        int total = mat.length*mat[0].length;
        total/=2;
         
        while(start<=end){
            int mid = start+(end-start)/2;
            int smaller = helper(mat,mid);
            if(smaller>total){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
        
    }
    public int helper(int[][] mat , int ub){
        int count=0;
        for(int[] r:mat){
            int start = 0;
            int end = r.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(r[mid]<=ub){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            count+=start;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
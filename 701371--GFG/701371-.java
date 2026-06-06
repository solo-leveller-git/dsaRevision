class Solution {
    public int numOfWays(int n, int m) {
        // code here
        int total = n*m-1;
        int[] x = {-2, -2, 2, 2, -1, 1, -1, 1};
        int[] y = {-1, 1, -1, 1, -2, -2, 2, 2};
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                int no = 0;
                for(int k = 0 ; k < 8 ; k++){
                    int dx = i+x[k];
                    int dy = j+y[k];
                    if(dx<n && dx>=0 && dy<m && dy>=0){
                        no++;
                    }
                }
                ans+=total-no;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
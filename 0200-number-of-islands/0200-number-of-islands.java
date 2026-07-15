class Solution {
    private int[] r = new int[]{0,0,-1,1};
    private int[] c = new int[]{-1,1,0,0};
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
        }
        public void dfs(char[][] grid, int i, int j){
            for(int k = 0 ; k < 4 ; k++){
                int x = i+r[k];
                int y = j+c[k];
                if(x<0 || y<0 || x>grid.length-1 || y>grid[0].length-1)continue;
                else if(grid[x][y]=='1'){
                    grid[x][y]='2';
                    dfs(grid,x,y);
                }
            }
        }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
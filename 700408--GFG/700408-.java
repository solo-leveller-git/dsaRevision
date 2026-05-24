class Solution {
    
    ArrayList<String> ans = new ArrayList<>();

    int[][] dir = {
        {1, 0},   // D
        {0, 1},   // R
        {0, -1},  // L
        {-1, 0}   // U
    };

    public char getDir(int[] d) {
        if (d[0] == 1 && d[1] == 0) return 'D';
        if (d[0] == 0 && d[1] == 1) return 'R';
        if (d[0] == 0 && d[1] == -1) return 'L';
        return 'U';
    }

    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        if (maze[0][0] == 0) return ans;

        boolean[][] vis = new boolean[n][n];

        vis[0][0] = true;

        dfs(maze, vis, 0, 0, new StringBuilder());
        
        Collections.sort(ans);

        return ans;
    }

    public void dfs(int[][] m, boolean[][] vis,
                    int i, int j, StringBuilder sb) {

        if (i == m.length - 1 && j == m[0].length - 1) {
            ans.add(sb.toString());
            return;
        }

        for (int[] d : dir) {

            int ni = i + d[0];
            int nj = j + d[1];

            if (ni >= 0 && ni < m.length &&
                nj >= 0 && nj < m[0].length) {

                if (!vis[ni][nj] && m[ni][nj] == 1) {

                    vis[ni][nj] = true;

                    sb.append(getDir(d));

                    dfs(m, vis, ni, nj, sb);

                    sb.deleteCharAt(sb.length() - 1);

                    vis[ni][nj] = false;
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
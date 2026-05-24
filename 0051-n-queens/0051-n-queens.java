class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
boolean[] cols = new boolean[n];
boolean[] diag = new boolean[2 * n];
boolean[] anti = new boolean[2 * n];
rec(n,0,cols,diag,anti, new ArrayList<>());
return ans;
    }
    public void rec(int n, int i, boolean[] cols, boolean[] diag, boolean[] anti, ArrayList<String> l){


        if(i==n){
ans.add(new ArrayList<>(l));
return;
        }

        for(int k = 0 ; k < n ; k++ ){
StringBuilder sb = new StringBuilder();
if(cols[k] || diag[i - k + n] || anti[i + k]) continue;
for(int t = 0 ; t < n ; t++){
    if(t==k)sb.append('Q');
    else sb.append('.');
}
l.add(sb.toString());
            cols[k]=true;
            diag[i-k+n]=true;
            anti[i+k]=true;
            rec(n,i+1,cols,diag,anti,l);
            l.remove(l.size()-1);
            cols[k]=false;
            diag[i-k+n]=false;
            anti[i+k]=false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
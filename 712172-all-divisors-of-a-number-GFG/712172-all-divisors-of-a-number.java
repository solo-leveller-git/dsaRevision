class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i*i <= n ; i++){
            if(n%i==0){ans.add(i);
            int q = n/i;
            if(q!=i)ans.add(q);}
        }
        Collections.sort(ans);
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
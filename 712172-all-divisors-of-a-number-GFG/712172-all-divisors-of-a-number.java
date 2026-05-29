class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i =1 ; i*i <= n ; i++){
            if(n%i==0){
                l.add(i);
            }
            if(n%i==0 && i!=n/i){
                l2.add(n/i);
            }
            
        }
        for(int i = l2.size()-1 ; i>=0 ; i--){
            l.add(l2.get(i));
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
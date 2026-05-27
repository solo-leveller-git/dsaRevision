class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(isPal(s,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPal(String s, int i, int j){
        if(i>=j)return true;
        if(s.charAt(i)!=s.charAt(j))return false;
        return isPal(s,i+1,j-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        helper(s,0,new ArrayList<>());
        return ans;
    }
    public void helper(String s, int i, List<String> l){
        if(i>=s.length()){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j = i ; j < s.length() ; j++){
            if(isP(s.substring(i,j+1))){
                l.add(s.substring(i,j+1));
                helper(s,j+1,l);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isP(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int countSubstr(String s, int k) {
        return helper(s,k)-helper(s,k-1);
        
    }
    public int helper(String s, int k){
        
        Map<Character,Integer> mp = new HashMap<>();
        int ans = 0;
        int l = 0;
        for(int i = 0 ; i < s.length() ; i++){
            
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            while(mp.size()>k){
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                if(mp.get(s.charAt(l))==0)mp.remove(s.charAt(l));
                l++;
            }
            ans+=i-l+1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            if(!mp.containsKey(ch))return false;
            
            mp.put(ch,mp.getOrDefault(ch,0)-1);
            if(mp.get(ch)<=0)mp.remove(ch);
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
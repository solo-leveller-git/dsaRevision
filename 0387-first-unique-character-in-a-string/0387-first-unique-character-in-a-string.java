class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int i = -1;
        for(char ch:s.toCharArray()){
            i++;
            if(mp.get(ch)==1)return i;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int firstUniqChar(String s) {
        int[] bucket = new int[27];
        for(char ch:s.toCharArray()){
            bucket[ch-'a']++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(bucket[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
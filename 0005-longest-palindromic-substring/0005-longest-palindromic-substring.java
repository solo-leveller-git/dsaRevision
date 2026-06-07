class Solution {
    public String longestPalindrome(String s) {
        String max = s.substring(0,1);
        for(int i = 0 ; i < s.length()-1 ; i++){
            String odd = isP(s,i,i);
            String even = isP(s,i,i+1);
            if(odd.length()>max.length()){
                max=odd;
            }
            if(even.length()>max.length()){
                max=even;
            }
        }
        return max;
    }
    public String isP(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
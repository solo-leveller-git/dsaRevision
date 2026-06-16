class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char curr = s.charAt(i);
            if(Character.isLowerCase(curr))sb.append(curr);
            else if(curr=='*'){
                if(sb.length()>0)sb.deleteCharAt(sb.length()-1);
            }
            else if(curr=='#')sb.append(sb);
            else{
               sb.reverse();
            }
        } 
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
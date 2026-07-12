class Solution {
    String removeDuplicates(String s) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                if( !lower.contains(ch)){
                sb.append(ch);
                    lower.add(ch);
                }
            }
            else{
                if(!upper.contains(ch)){
                    sb.append(ch);
                    upper.add(ch);
                }
            }
        }
        return sb.toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
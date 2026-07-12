class Solution {
    public String longest(String[] arr) {
        // code here
        String ans = "";
        for(String s:arr){
            if(s.length()>ans.length())ans=s;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public boolean wifiRange(String s, int x) {
        if(s.length()==1 && s.charAt(0)=='0')return false;
        int range = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='1'){
                range=x;
            }
            else range--;
            if(range<0){
                if(i==s.length()-1)return false;
                if(-1*range>x)return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
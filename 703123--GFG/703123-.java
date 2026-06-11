class Solution {
    public int findIndex(String s) {
        // code here
        int close = 0;
        for(char ch:s.toCharArray()){
            if(ch==')')close++;
        }
        int open = 0;
        int i = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;}
                else{
                close--;}
                if(open==close)return i+1;
                i++;
        }
        return 0;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
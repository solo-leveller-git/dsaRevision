class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!st.isEmpty() && (st.peek()=='{' || st.peek()=='['))return false;
                else if(!st.isEmpty() && (st.peek()=='('))st.pop();
                else st.push(ch);
            }
            else if(ch=='}'){
                if(!st.isEmpty() && (st.peek()=='(' || st.peek()=='['))return false;
                else if(!st.isEmpty() && (st.peek()=='{'))st.pop();
                else st.push(ch);
            }
            else if(ch==']'){
                if(!st.isEmpty() && (st.peek()=='{' || st.peek()=='('))return false;
                else if(!st.isEmpty() && (st.peek()=='['))st.pop();
                else st.push(ch);
            }
            else st.push(ch);
        }
        return st.size()==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
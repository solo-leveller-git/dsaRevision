class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty())return;
        int out = st.pop();
        reverseStack(st);
        helper(st,out);
    }
    public static void helper(Stack<Integer> st, int in){
        if(st.isEmpty()){
            st.push(in);
            return;
        }
        int out = st.pop();
        helper(st,in);
        st.push(out);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
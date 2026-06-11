class Solution {
    public void sortStack(Stack<Integer> st) {
        if(st.isEmpty())return;
        int out = st.pop();
        sortStack(st);
        helper(st,out);
        
    }
    private void helper(Stack<Integer> st, int in) {
    if (st.isEmpty() || st.peek() <= in) {
        st.push(in);
        return;
    }

    int out = st.pop();
    helper(st, in);
    st.push(out);
}
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
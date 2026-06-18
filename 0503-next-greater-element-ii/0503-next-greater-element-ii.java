class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        ans[nums.length - 1] = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= st.peek()) st.pop();
            if(st.size()>=1)ans[i]=st.peek();
            else ans[i]=-1;
            st.push(nums[i]);
            

        }
        int i = nums.length-1;
        while(i>=0 && !st.isEmpty()){
            while (!st.isEmpty() && nums[i] >= st.peek()) st.pop();
            if(st.size()>=1)ans[i]=st.peek();
            else ans[i]=-1;
            st.push(nums[i]);
            
            i--;
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
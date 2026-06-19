class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse = new int[heights.length];
        Arrays.fill(pse, -1);
        int[] nse = new int[heights.length];
        Arrays.fill(nse,nse.length);
        Stack<Integer> n = new Stack<>();
        for(int i = 0 ; i < nse.length ; i++){
            while(!n.isEmpty() && heights[i]<heights[n.peek()]){
                nse[n.pop()]=i;
            }
            n.push(i);
        }
        Stack<Integer> p = new Stack<>();
        for(int i = pse.length-1 ; i >=0 ; i--){
            while(!p.isEmpty() && heights[i]<heights[p.peek()]){
                pse[p.pop()]=i;
            }
            p.push(i);
        }
        int ans = 0;
        for(int i = 0 ; i < nse.length ; i++){
            ans=Math.max(ans,(nse[i]-pse[i]-1)*heights[i]);

        }
        return ans;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
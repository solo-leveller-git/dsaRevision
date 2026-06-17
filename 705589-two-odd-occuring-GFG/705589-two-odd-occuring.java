class Solution {
    ArrayList<Integer> twoOddNum(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int totalXor = 0;
        for(int n:nums)totalXor^=n;
        int x = totalXor&-totalXor;
        int first = 0;
        int second = 0;
        for(int n:nums){
            if((n&x)>0)first^=n;
            else second^=n;
        }
        if(first>second)
        {
            
        ans.add(first);
        ans.add(second);
        }
        else{
            ans.add(second);
            ans.add(first);
        }
        return ans;
        
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
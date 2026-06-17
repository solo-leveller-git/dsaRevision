class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2)return nums;
        int totalXor = 0;
        for(int n:nums)totalXor^=n;
        int x = totalXor&-totalXor;
        int first = 0;
        int second = 0;
        for(int n:nums){
            if((n&x)>0)first^=n;
            else second^=n;
        }
        return new int[]{first,second};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
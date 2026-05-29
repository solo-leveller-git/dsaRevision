class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            int curr = sumD(n);
            min=Math.min(min,curr);
        }
        return min;
    }
    public int sumD(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
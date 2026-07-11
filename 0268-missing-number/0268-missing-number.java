class Solution {
    public int missingNumber(int[] nums) {
     int sum = 0;
     for(int n:nums)sum+=n;
     int ap =(int)(((double)(nums.length+1)/2)*(nums.length));
     if(ap>sum)
     return ap-sum;   
     return sum-ap;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
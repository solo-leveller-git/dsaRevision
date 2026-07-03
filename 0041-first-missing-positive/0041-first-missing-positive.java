class Solution {
    public int firstMissingPositive(int[] nums) {
     int[] bucket = new int[100001];
     for(int n:nums){
        if(n>=0 && n<=100000)
        bucket[n]=1;
     }   
     int i = 0;
     for(int n:bucket){
        if(i!=0)
        if(n==0)return i;
        i++;
     }
     return 100001;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
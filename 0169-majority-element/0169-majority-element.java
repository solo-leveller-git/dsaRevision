class Solution {
    public int majorityElement(int[] nums) {
        int m = nums[0];
        int c = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]==m){
                c+=1;
            }
            else{
                c-=1;
                if(c<0){
                    m=nums[i];
                    c=1;}
            }
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
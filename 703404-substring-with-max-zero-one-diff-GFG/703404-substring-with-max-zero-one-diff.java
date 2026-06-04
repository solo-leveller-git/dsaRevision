class Solution {
    int maxSubstring(String s) {
        // code here
        int ans = 0;
        int sum =0;
        int zero = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='1')sum-=1;
            else{ zero++;sum+=1;}
            if(sum<0)sum=0;
            ans=Math.max(ans,sum);
        }     
        if(zero==0)return -1;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
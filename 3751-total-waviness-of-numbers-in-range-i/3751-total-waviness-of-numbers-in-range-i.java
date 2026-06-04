class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2<=100)return 0;
        if(num1<=100)num1=101;
        int ans = 0;
        for(int i = num1 ; i<=num2 ; i++){
            String s = Integer.toString(i);
            ans+=check(s);
        }
        return ans;
    }
    public int check(String s){
        int i = 1;
        int ans = 0;
        while(i<s.length()-1){
            int mid = s.charAt(i)-0;
            int left = s.charAt(i-1)-0;
            int right = s.charAt(i+1)-0;
            if((mid>left && mid>right) || (mid<left && mid<right))ans++;
            i++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
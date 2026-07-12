class Solution {
    public int lcm(int a, int b) {
        if(b>a)return lcm(b,a);
        int i = 1;
        while((a*i)%b!=0){
            i+=1;
        }
        if(i>1)a*=i;
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
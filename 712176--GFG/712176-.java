class Solution {
   static int oton(int n){
        if(n%4==1)return 1;
        else if(n%4==2)return n+1;
        else if(n%4==3)return 0;
        else return n;
    }
    public static int findXOR(int l, int r) {
int firstGroup = oton(l-1);
int secondGroup = oton(r);
return firstGroup^secondGroup;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int countPrimes(int n) {
        boolean[] nonPrime = new boolean[n];
        int ans =0;
for(int i = 2; i < n ; i++){
    if(!nonPrime[i])ans++;
    for(int j = 2 ; i*j<n ; j++){
        nonPrime[j*i]=true;
    }
}
return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
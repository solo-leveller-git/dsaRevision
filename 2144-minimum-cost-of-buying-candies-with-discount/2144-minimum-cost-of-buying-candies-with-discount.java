class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        if(cost.length==1)return cost[0];
        if(cost.length<=3 && cost.length>1)return cost[cost.length-1]+cost[cost.length-2];
        for(int i = cost.length-1 ; i >= 0 ; i-=3){
            if(i-1>=0)
sum+=cost[i]+cost[i-1];
else{
    sum+=cost[i];
}
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int maxAmount(int[] arr, int k) {
        int MOD = (int)1e9+7;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr)pq.offer(i);
        int ans = 0;
        while(k-->0 && !pq.isEmpty()){
            int curr = pq.poll();
            ans=(ans+curr)%MOD;
            if(curr>0)
            pq.offer(curr-1);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
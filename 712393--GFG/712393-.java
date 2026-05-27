class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
     Arrays.sort(a);
        Arrays.sort(b);
        
        int m = a.length;
        int n = b.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((c, d) -> d[0]-c[0]);

        HashSet<String> set = new HashSet<>();
        pq.offer(new int[]{(a[m-1]+b[n-1]), m-1, n-1});

        while(res.size() < k){
            int[] curr = pq.poll();

            int ca = curr[1]; 
            int cb = curr[2]; 
            res.add(curr[0]);
            String n1 = (ca-1)+" "+cb;
            if(ca-1 >= 0 && !set.contains(n1)){
                set.add(n1);
                pq.offer(new int[]{(a[ca-1] + b[cb]), ca-1, cb});
            }
            String n2 = ca+" "+(cb-1);

            if(cb-1 >= 0 && !set.contains(n2)){
                set.add(n2);
                pq.offer(new int[]{(a[ca] + b[cb-1]), ca, cb-1});
            }
        }
        return res;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
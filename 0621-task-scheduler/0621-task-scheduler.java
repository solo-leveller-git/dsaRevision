class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> fmap = new HashMap<>();
        for(char t:tasks){
            fmap.put(t,fmap.getOrDefault(t,0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        p.addAll(fmap.values());
        Queue<int[]> q = new LinkedList<>();
        int time = 0;
         while(!q.isEmpty() || !p.isEmpty()){
            time++;
            if(!q.isEmpty() && q.peek()[0]==time){
                p.offer(q.poll()[1]);
            }
            if(!p.isEmpty()){
                int f = p.poll();
                int rf = f-1;
                if(rf>0)
                {
                    int nat = time+n+1;
                    q.add(new int[]{nat,rf});
                }
            }
         }
 return time;   }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
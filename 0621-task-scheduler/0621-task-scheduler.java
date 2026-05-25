class Solution {
    public int leastInterval(char[] tasks, int n) {

        Map<Character,Integer> m = new HashMap<>();

        for(char ch : tasks){
            m.put(ch, m.getOrDefault(ch,0) + 1);
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for(int v : m.values()){
            pq.add(v);
        }

        int ans = 0;

        while(!pq.isEmpty()){

            List<Integer> l = new ArrayList<>();

            int count = 0;

            for(int i = 0 ; i < n + 1 ; i++){

                if(!pq.isEmpty()){

                    int out = pq.poll();

                    if(out - 1 > 0){
                        l.add(out - 1);
                    }

                    count++;
                }
            }

            for(int x : l){
                pq.offer(x);
            }

            if(pq.isEmpty()){
                ans += count;
            }
            else{
                ans += n + 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
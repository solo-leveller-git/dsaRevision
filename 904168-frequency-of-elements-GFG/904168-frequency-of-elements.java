class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:arr)mp.put(n,mp.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            ans.add(new ArrayList<>(Arrays.asList(e.getKey(),e.getValue())));
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
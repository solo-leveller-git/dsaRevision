class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] curr = s.toCharArray();
            Arrays.sort(curr);
            String sorted = new String(curr);
            mp.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,ArrayList<String>> e: mp.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
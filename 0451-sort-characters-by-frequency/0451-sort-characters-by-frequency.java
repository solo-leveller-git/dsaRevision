import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        List<Character>[] buckets = new ArrayList[s.length() + 1];

        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            int freq = e.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(e.getKey());
        }

        StringBuilder ans = new StringBuilder();

        for (int freq = buckets.length - 1; freq >= 1; freq--) {
            if (buckets[freq] != null) {
                for (char ch : buckets[freq]) {
                    for (int i = 0; i < freq; i++) {
                        ans.append(ch);
                    }
                }
            }
        }

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        rec(nums, 0, new ArrayList<>());

        return ans;
    }

    public void rec(int[] n, int i, List<Integer> l) {

        if(i == n.length) {
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(n[i]);

        rec(n, i + 1, l);

        l.remove(l.size() - 1);
        rec(n, i + 1, l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
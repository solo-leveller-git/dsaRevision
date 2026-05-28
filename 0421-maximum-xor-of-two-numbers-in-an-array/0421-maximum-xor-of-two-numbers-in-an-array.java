class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[2];
    }

    TrieNode root = new TrieNode();

    public void insert(int num) {
        TrieNode node = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;

            if (node.child[bit] == null) {
                node.child[bit] = new TrieNode();
            }

            node = node.child[bit];
        }
    }
    public int getMaxXor(int num) {
        TrieNode node = root;

        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int opposite = 1 - bit;
            if (node.child[opposite] != null) {
                maxXor = maxXor | (1 << i);

                node = node.child[opposite];
            } 
            else {
                maxXor = maxXor | (0 << i);

                node = node.child[bit];
            }
        }

        return maxXor;
    }

    public int findMaximumXOR(int[] nums) {
        for (int num : nums) {
            insert(num);
        }

        int ans = 0;

        for (int num : nums) {
            ans = Math.max(ans, getMaxXor(num));
        }

        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
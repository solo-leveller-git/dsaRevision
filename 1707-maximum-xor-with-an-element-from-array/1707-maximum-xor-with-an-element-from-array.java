class Solution {

    class TrieNode{
        TrieNode[] child = new TrieNode[2];
    }

    TrieNode root = new TrieNode();

    public void insert(int num){

        TrieNode node = root;

        for(int i = 31 ; i >= 0 ; i--){

            int bit = (num >> i) & 1;

            if(node.child[bit] == null){
                node.child[bit] = new TrieNode();
            }

            node = node.child[bit];
        }
    }
    public int getMaxXor(int num){

        TrieNode node = root;

        if(node.child[0] == null &&
           node.child[1] == null){
            return -1;
        }

        int maxXor = 0;

        for(int i = 31 ; i >= 0 ; i--){

            int bit = (num >> i) & 1;

            int opposite = 1 - bit;

            if(node.child[opposite] != null){

                maxXor |= (1 << i);

                node = node.child[opposite];
            }
            else{
                node = node.child[bit];
            }
        }

        return maxXor;
    }

    public int[] maximizeXor(int[] nums, int[][] queries) {

        Arrays.sort(nums);

        int[][] q = new int[queries.length][3];

        for(int i = 0 ; i < queries.length ; i++){

            q[i][0] = queries[i][0];
            q[i][1] = queries[i][1];
            q[i][2] = i;
        }

        Arrays.sort(q, (a,b) -> a[1] - b[1]);

        int[] ans = new int[queries.length];

        int idx = 0;

        for(int[] query : q){

            int x = query[0];
            int m = query[1];
            int originalIndex = query[2];

            while(idx < nums.length &&
                  nums[idx] <= m){

                insert(nums[idx]);

                idx++;
            }

            ans[originalIndex] = getMaxXor(x);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
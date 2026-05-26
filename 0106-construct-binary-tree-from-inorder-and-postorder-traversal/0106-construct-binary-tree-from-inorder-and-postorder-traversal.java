/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return rec(
                postorder,
                0,
                postorder.length - 1,
                inorder,
                0,
                inorder.length - 1,
                map
        );
    }

    public TreeNode rec(
            int[] post,
            int ps,
            int pe,
            int[] in,
            int is,
            int ie,
            Map<Integer, Integer> map
    ) {

        if (ps > pe || is > ie) {
            return null;
        }

        TreeNode root = new TreeNode(post[pe]);

        int inRoot = map.get(root.val);

        int numsLeft = inRoot - is;

        root.left = rec(
                post,
                ps,
                ps + numsLeft - 1,
                in,
                is,
                inRoot - 1,
                map
        );

        root.right = rec(
                post,
                ps + numsLeft,
                pe - 1,
                in,
                inRoot + 1,
                ie,
                map
        );

        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
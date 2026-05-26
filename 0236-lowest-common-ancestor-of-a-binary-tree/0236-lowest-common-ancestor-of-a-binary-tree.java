/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return rec(root,p,q);
    }
    public TreeNode rec(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root==p || root==q)return root;
        TreeNode left = rec(root.left,p,q);
        TreeNode right = rec(root.right,p,q);
        if(left!=null && right!=null)return root;
        return left==null?right:left;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
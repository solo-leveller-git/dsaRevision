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
    TreeNode first;
    TreeNode mid;
    TreeNode last;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        first=mid=last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int temp =first.val;
            first.val=last.val;
            last.val=temp;
        }
        else{
            int temp =first.val;
            last=mid;
            first.val=last.val;
            last.val=temp;
        }
    }
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        if(prev!=null && (root.val<prev.val)){
            if(first==null){
                first=prev;
                mid=root;
            }
            else{
                last=root;
            }
        }
        prev=root;
        inorder(root.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
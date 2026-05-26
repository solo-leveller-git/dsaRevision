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

    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==1)return new TreeNode(preorder[0]);
        Map<Integer,Integer> m = new HashMap<>();
        
        int[] inorder = new int[preorder.length];
       

        System.arraycopy(preorder, 0, inorder, 0, preorder.length);
        Arrays.sort(inorder);
         for(int i = 0 ; i < inorder.length; i++){
            m.put(inorder[i],i);
        }
        TreeNode root = rec(preorder,inorder,0,preorder.length-1,0,inorder.length-1,m);
        return root;
    }
    public TreeNode rec(int[]preorder,int[]inorder,int ps, int pe, int ins, int ine, Map<Integer,Integer> m){
        if(ps>pe || ins>ine)return null;
        TreeNode root=new TreeNode(preorder[ps]);
        int inroot = m.get(preorder[ps]);
        int left = inroot-ins;
        root.left=rec(preorder,inorder,ps+1,ps+left,ins,inroot-1,m);
        root.right=rec(preorder,inorder,ps+left+1,pe,inroot+1,ine,m);
        return root;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
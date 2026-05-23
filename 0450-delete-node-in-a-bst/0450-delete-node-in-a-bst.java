class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root != null && root.val == key){
            TreeNode right = root.right;

            if(root.left == null) return right;

            TreeNode newRoot = root.left;
            merge(newRoot, right);

            return newRoot;
        }

        return rem(root,key);
    }

    public void merge(TreeNode root, TreeNode mrg){
        if(root == null) return;

        while(root.right != null){
            root = root.right;
        }

        root.right = mrg;
    }

    public TreeNode rem(TreeNode root, int key){
        if(root == null) return root;

        TreeNode res = root;

        while(root != null){

            if(root.left != null && key == root.left.val){

                TreeNode del = root.left;
                TreeNode mrg = del.right;

                if(del.left == null){
                    root.left = mrg;
                }
                else{
                    root.left = del.left;
                    merge(root.left, mrg);
                }

                break;
            }

            else if(root.right != null && key == root.right.val){

                TreeNode del = root.right;
                TreeNode mrg = del.right;

                if(del.left == null){
                    root.right = mrg;
                }
                else{
                    root.right = del.left;
                    merge(root.right, mrg);
                }

                break;
            }

            else if(key < root.val){
                root = root.left;
            }

            else{
                root = root.right;
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
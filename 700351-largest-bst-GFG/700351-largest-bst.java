class Solution {

    static class Info{

        int min;
        int max;
        int size;

        Info(int min, int max, int size){
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    static int largestBst(Node root) {

        return rec(root).size;
    }

    public static Info rec(Node root){

        if(root == null){
            return new Info(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            );
        }

        Info left = rec(root.left);
        Info right = rec(root.right);

        if(root.data > left.max &&
           root.data < right.min){

            int currMin = Math.min(root.data, left.min);

            int currMax = Math.max(root.data, right.max);

            int currSize = left.size + right.size + 1;

            return new Info(currMin, currMax, currSize);
        }

        return new Info(
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            Math.max(left.size, right.size)
        );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
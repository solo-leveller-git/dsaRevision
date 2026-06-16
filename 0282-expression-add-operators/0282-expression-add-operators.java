class Solution {

    List<String> ans;

    public List<String> addOperators(String num, int target) {
        ans = new ArrayList<>();

        helper(num, target, 0, "", 0, 0);

        return ans; 
    }

    public void helper(String num,
                       int target,
                       int i,
                       String path,
                       long last,
                       long eval) {

        if (i == num.length()) {
            if (eval == target) {
                ans.add(path);
            }
            return; 
        }

        for (int j = i; j < num.length(); j++) {

            if (j > i && num.charAt(i) == '0')
                break;

            long curr = Long.parseLong(num.substring(i, j + 1));
            if (i == 0) {

                helper(
                    num,
                    target,
                    j + 1,
                    path + curr,
                    curr,
                    curr
                );

            } else {

                helper(
                    num,
                    target,
                    j + 1,
                    path + "+" + curr, 
                    curr,
                    eval + curr
                );

                helper(
                    num,
                    target,
                    j + 1,
                    path + "-" + curr, 
                    -curr,             
                    eval - curr
                );
                helper(
                    num,
                    target,
                    j + 1,
                    path + "*" + curr,
                    last * curr,
                    eval - last + last * curr
                );
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
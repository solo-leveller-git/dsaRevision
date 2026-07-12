import java.util.Arrays;

class Solution {

    class Pair {
        int num;
        int idx;

        Pair(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    public int[] arrayRankTransform(int[] arr) {
        Pair[] nums = new Pair[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = new Pair(arr[i], i);
        }

        Arrays.sort(nums, (a, b) -> Integer.compare(a.num, b.num));
        int rank = 1;
        int[] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int j = nums[i].idx;
            ans[j]=rank;
            if(i+1<arr.length && nums[i].num!=nums[i+1].num)
            rank++;
        }
        return ans;
        }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
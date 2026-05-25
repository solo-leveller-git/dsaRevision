class Solution {

    class Item {
        int val;
        int wt;
        double ratio;

        Item(int val, int wt) {
            this.val = val;
            this.wt = wt;
            this.ratio = (double) val / wt;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        Item[] arr = new Item[n];

        for(int i = 0; i < n; i++) {
            arr[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(arr, (a,b) ->
            Double.compare(b.ratio, a.ratio));

        double ans = 0;

        for(Item item : arr) {

            if(capacity >= item.wt) {

                ans += item.val;
                capacity -= item.wt;
            }
            else {

                ans += item.ratio * capacity;
                break;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
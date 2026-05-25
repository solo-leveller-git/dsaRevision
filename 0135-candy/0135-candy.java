class Solution {

    public int candy(int[] ratings) {

        int n = ratings.length;

        if(n == 1) return 1;

        int sum = 1;

        int i = 1;

        while(i < n) {

            // equal ratings
            if(ratings[i] == ratings[i - 1]) {
                sum += 1;
                i++;
                continue;
            }

            int peak = 1;

            // increasing slope
            while(i < n && ratings[i] > ratings[i - 1]) {

                peak++;

                sum += peak;

                i++;
            }

            int down = 1;

            // decreasing slope
            while(i < n && ratings[i] < ratings[i - 1]) {

                sum += down;

                down++;

                i++;
            }

            // peak child counted in both slopes
            if(down > peak) {
                sum += down - peak;
            }
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
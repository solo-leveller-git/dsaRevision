class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> l = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
if(intervals.length==1){
   return new int[][]{{start,end}};
}
        for (int i = 1; i < intervals.length; i++) {

            while (i < intervals.length && intervals[i][0] <= end) {

                end = Math.max(end, intervals[i][1]);

                i++;
            }

            l.add(new int[]{start, end});

            if (i < intervals.length) {

                start = intervals[i][0];
                end = intervals[i][1];
            }
            if(i==intervals.length-1)l.add(new int[]{start, end});
        }

        return l.toArray(new int[l.size()][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
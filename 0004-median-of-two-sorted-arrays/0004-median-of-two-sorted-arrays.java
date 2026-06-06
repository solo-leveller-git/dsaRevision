class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if (m < n) return findMedianSortedArrays(nums2, nums1);

        int start = 0;
        int end = n;

        int len = (n + m + 1) / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mid2 = len - mid;

            int l1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int r1 = (mid == n) ? Integer.MAX_VALUE : nums1[mid];

            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r2 = (mid2 == m) ? Integer.MAX_VALUE : nums2[mid2];

            if (l1 <= r2 && l2 <= r1) {

                if ((n + m) % 2 == 1) {
                    return Math.max(l1, l2);
                }

                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

            } else if (l1 > r2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
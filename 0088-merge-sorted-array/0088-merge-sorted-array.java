class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m-1;
        int r2 = n-1;
        int p = m+n-1;
       while (r1 >= 0 && r2 >= 0) {
    if (nums1[r1] > nums2[r2]) {
        nums1[p] = nums1[r1];
        r1--;
    } else {
        nums1[p] = nums2[r2];
        r2--;
    }
    p--;
}

while (r2 >= 0) {
    nums1[p] = nums2[r2];
    p--;
    r2--;
}

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
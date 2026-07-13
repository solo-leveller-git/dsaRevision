class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m ; i < m+n ; i++){
            nums1[i]=nums2[i-m];
        }
        int idx = 0;
        for(int i = m ; i<m+n ; i++){
            int j = i;
            while(j>0 && nums1[j-1]>nums1[j]){
                int t = nums1[j];
                nums1[j]=nums1[j-1];
                nums1[j-1]=t;
                j--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
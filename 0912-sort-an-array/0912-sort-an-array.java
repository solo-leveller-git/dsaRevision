class Solution {
    int[] temp;

    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;

        int m = l + (r - l) / 2;

        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);
        merge(nums, l, m, r);
    }

    private void merge(int[] nums, int l, int m, int r) {
        int left = l, right = m + 1, idx = l;

        while (left <= m && right <= r) {
            if (nums[left] <= nums[right])
                temp[idx++] = nums[left++];
            else
                temp[idx++] = nums[right++];
        }

        while (left <= m) temp[idx++] = nums[left++];
        while (right <= r) temp[idx++] = nums[right++];

        for (int i = l; i <= r; i++) {
            nums[i] = temp[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
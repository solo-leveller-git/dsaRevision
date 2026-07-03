class Solution {
    int[] count;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];

        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        mergeSort(nums, idx, 0, n - 1);

        List<Integer> res = new ArrayList<>();
        for (int x : count) {
            res.add(x);
        }

        return res;
    }

    private void mergeSort(int[] nums, int[] idx, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(nums, idx, l, mid);
        mergeSort(nums, idx, mid + 1, r);

        merge(nums, idx, l, mid, r);
    }

    private void merge(int[] nums, int[] idx, int l, int mid, int r) {
        int left = l;
        int right = mid + 1;
        int cnt = 0;

        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= r) {
            if (nums[idx[left]] > nums[idx[right]]) {
                temp.add(idx[right]);
                right++;
                cnt++;
            } else {
                count[idx[left]] += cnt;
                temp.add(idx[left]);
                left++;
            }
        }

        while (left <= mid) {
            count[idx[left]] += cnt;
            temp.add(idx[left]);
            left++;
        }

        while (right <= r) {
            temp.add(idx[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            idx[i] = temp.get(i - l);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
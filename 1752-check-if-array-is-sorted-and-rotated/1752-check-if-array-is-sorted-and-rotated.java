class Solution {
    public boolean check(int[] nums) {

        int n = nums.length - 1;

        while (n >= 0 && nums[0] == nums[n]) 
            n--;

        int i = 1;

        while (i <= n && nums[i] >= nums[i - 1]) 
            i++;
        if (i > n) 
            return true;

        for (int j = i + 1; j <= n; j++) {
            if (nums[j] < nums[j - 1] || nums[j] > nums[0])
                return false;
        }

        if (nums[n] > nums[0])
            return false;

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
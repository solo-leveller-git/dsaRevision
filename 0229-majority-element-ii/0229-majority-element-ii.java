class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int num1 = 0;
        int num2 = 0;
        for (int n : nums) {
            if (n == num1) {
                count1++;
            } else if (n == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = n;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = n;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for (int n : nums) {
            if (n == num1) count1++; else if (n == num2) count2++;
        }
        if (count1 > nums.length/3) ans.add(num1);
        if (count2 > nums.length/3) ans.add(num2);
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
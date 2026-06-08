class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        int pivotCount = 0;
        for(int n:nums){
            if(n<pivot){
                small.add(n);
            }
            else if(n==pivot)pivotCount++;
            else{
                large.add(n);
            }
        }
        while(pivotCount-->0)small.add(pivot);
        small.addAll(large);
        int[] arr = small.stream()
                .mapToInt(Integer::intValue)
                .toArray();
                return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
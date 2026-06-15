class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>());
        return ans;
    }
    public void helper(int[] arr, int target, int i, ArrayList<Integer> l){
        if(i>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(l));
                return;
            }
            return;
        }
        if(target-arr[i]>=0){
            l.add(arr[i]);
            helper(arr,target-arr[i],i+1,l);l.remove(l.size()-1);
        }
        
        while(i<arr.length-1 && arr[i+1]==arr[i])i++;
        i++;
        helper(arr,target,i,l);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
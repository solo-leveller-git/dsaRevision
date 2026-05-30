class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int temp=arr[0];
        for(int i = 0 ; i <arr.length-1 ; i++){
            int curr=arr[i];
            arr[i]=temp^arr[i+1];
            temp=curr;
        }
        arr[arr.length-1]=arr[arr.length-1]^temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
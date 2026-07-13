class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            int j = i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int t = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
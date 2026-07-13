class Solution {
    void selectionSort(int[] arr) {
        int k = 0;
        for(int i = 0 ; i <arr.length ; i++){
            int idx = -1;
            int min = arr[k];
            for(int j = k+1; j <arr.length ; j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            if(idx!=-1){
            int t = arr[idx];
            arr[idx]=arr[k];
            arr[k]=t;}
            k++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        if(k>seats.length/2+1)return false;
        if(seats.length==1 && seats[0]==0)return true;
        if(seats.length==1 && k==0)return true;
        if(seats.length==1 && seats[0]==1 && k>=1)return false;
        int seat = k;
        int i = 0;
        while(i<seats.length){
            if(i==0){
                if(seats[i]==1 && seats[i+1]==1)return false;
                else if(seats[i]==0 && seats[i+1]!=1){
                    k--;
                    seats[i]=1;}
            }
            else if(i==seats.length-1){
                if(seats[i]==1 && seats[i-1]==1)return false;
                else if(seats[i]==0 && seats[i-1]!=1){
                    k--;
                    seats[i]=1;}
            }
            else{
                if((seats[i]==1 && seats[i+1]==1) || (seats[i]==1 && seats[i-1]==1) )return false;
                else if(seats[i]==0 && seats[i+1]!=1 && seats[i-1]!=1){
                    k--;
                    seats[i]=1;}
            }
            i++;
        }
        return (k<=0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
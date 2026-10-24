class Solution {
    public int climbStairs(int n) {
        int onestep = 1;
        int twostep = 1;
        int temp;
        for(int i=n-2;i>=0;i--){
            temp=onestep;
            onestep=onestep + twostep;
            twostep = temp;
            
        }

        return onestep;
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int twoStep = cost[n - 1];
        int oneStep = cost[n - 2];
        int temp;
        for(int i=n-3;i>=0;i--){
            temp = oneStep;
            oneStep = cost[i] + Math.min(oneStep, twoStep);
            twoStep = temp;
        }

        return Math.min(oneStep, twoStep);
    }
}

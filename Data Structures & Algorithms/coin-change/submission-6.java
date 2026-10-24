class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount==0){
            return 0;
        }
        int min = amount + 1;
        ArrayList<Integer> dp = new ArrayList<>();

        Arrays.sort(coins);

        dp.add(0);

        for(int i=1;i<=amount;i++){
            if(i-coins[0]<0){
                dp.add(amount+1);
                continue;
            }
            else {
                min=dp.get(i-coins[0]);
            }
            for(int j=0; j<coins.length;j++){
                if(i-coins[j]<0){
                    continue;
                }

                
                if(dp.get(i-coins[j]) == amount + 1){
                    continue;
                }
                min=Math.min(min, dp.get(i-coins[j]));
            }
            dp.add(Math.min(min+1, amount + 1));
        }  

        return dp.get(amount) == amount + 1 ? -1 : dp.get(amount);
    }
}

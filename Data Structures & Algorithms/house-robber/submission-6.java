class Solution {
    public int rob(int[] nums) {
        

        int one = nums[0];
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[1], nums[0]);
        }
        int two = nums[1];
        int rob = 0;
        int temp;
        for(int i=2;i<nums.length;i++){
            rob = Math.max(one + nums[i], two);
            one = Math.max(one, two);
            two = rob;
        }

        return rob;
    }
}

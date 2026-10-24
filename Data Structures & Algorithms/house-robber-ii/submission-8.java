class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int rob1 = func(Arrays.copyOfRange(nums, 0, nums.length-1));
        int rob2 = func(Arrays.copyOfRange(nums, 1, nums.length));


        return Math.max(rob1, rob2);
    }

    public int func(int[] nums){
        if(nums.length ==1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[1], nums[0]);
        }

        int one = nums[0];
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

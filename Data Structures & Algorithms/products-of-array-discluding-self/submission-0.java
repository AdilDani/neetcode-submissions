class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int[] leftP = new int[len];
        int[] rightP = new int[len];

        leftP[0]=1;
        rightP[len-1]=1;
        for(int i=1;i<len;i++){
            leftP[i]=leftP[i-1] * nums[i-1];
            rightP[len-i-1]=rightP[len-i-1+1] * nums [len - i -1+ 1];
        }

        for(int i = 0; i<len;i++){
            result[i]=leftP[i]*rightP[i];
        }
        return result;
    }
}  

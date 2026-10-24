class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        if(nums.length == 0){
            return 0;
        }
        
        for (int num : nums) set.add(num);

        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)){
                    length++;
                }
            result = Math.max(result, length);

            }

        }
        
        return result;
    }
}
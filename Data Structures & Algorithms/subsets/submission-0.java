class Solution {
     private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> subset = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
    

        add(0);
        return result;
    }

    public void add(int i){
        if(i>=nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        add(i+1);

        subset.remove(subset.size() - 1);
        add(i+1);
    }

}

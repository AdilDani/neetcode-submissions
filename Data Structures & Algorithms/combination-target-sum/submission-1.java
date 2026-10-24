class Solution {
    private int target;
    private int[] nums;
    private List<List<Integer>> result = new ArrayList<>();
    private int current = 0;
    private ArrayList<Integer> subset = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        this.nums=nums;
        this.target=target;

        add(0);

        return result;
    }

    public void add(int i){
        if(current== target){
            result.add(new ArrayList<>(subset));
            return;
        }
        if(i>=nums.length){
            return;
        }
        
        else if(current>target){
            return;
        }
        current+=nums[i];
        subset.add(nums[i]);

        add(i);

        current-=nums[i];
        subset.remove(subset.size() - 1);   

        add(i+1);
            
    }

}

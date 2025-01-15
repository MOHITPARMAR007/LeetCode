class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int n = nums.length;
        
        recursion(0, curr, nums, res);
        return res;
    }
    
    private void recursion(int cur_index, List<Integer> curr, int[] nums, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));
        
        for (int index_of_next = cur_index; index_of_next < nums.length; index_of_next++) {
            curr.add(nums[index_of_next]);
            recursion(index_of_next + 1, curr, nums, res);
            curr.remove(curr.size() - 1);
        }
    }
}
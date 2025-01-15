import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        helper(new ArrayList<>(), nums, 0);
        return res;
    }

    private void helper(List<Integer> current, int[] nums, int index) {
        if (index == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        helper(current, nums, index + 1);

        current.add(nums[index]);
        helper(current, nums, index + 1);

        current.remove(current.size() - 1);
    }
}

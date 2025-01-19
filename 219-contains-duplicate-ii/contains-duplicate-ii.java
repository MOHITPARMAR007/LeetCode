class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]); // Add the value (nums[i]), not the index
            if (set.size() > k) set.remove(nums[i - k]); // Remove the value that is k distance away
        }
        return false;
    }
}

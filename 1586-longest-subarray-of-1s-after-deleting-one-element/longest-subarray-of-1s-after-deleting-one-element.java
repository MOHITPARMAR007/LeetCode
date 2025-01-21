class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int zeroCount = 0;
        int maxLength = 0;
        
        while (j < nums.length) {
            if (nums[j] == 0) {
                zeroCount++;
            }
            
            while (zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            
            maxLength = Math.max(maxLength, j - i);
            j++;
        }
        
        return maxLength;
    }
}

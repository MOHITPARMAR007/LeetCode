class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0; // To store the maximum window size
        int i = 0; // Pointer for acquiring new elements
        int j = -1; // Pointer for releasing elements
        int countZeros = 0; // To count the number of zeros in the current window
        
        while (i < nums.length) {
            // Acquiring new elements
            if (nums[i] == 0) {
                countZeros++; // Increment zero count if a zero is added
            }
            i++;
            
            // Releasing elements until the window is valid
            while (countZeros > k) {
                j++;
                if (nums[j] == 0) { // If releasing a zero, decrement zero count
                    countZeros--;
                }
            }
            
            // Calculate window size and update the answer
            int windowSize = i - j - 1; // Current window size
            ans = Math.max(ans, windowSize); // Update maximum window size
        }
        
        return ans;
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        // Initialize prefix and suffix arrays
        int[] prifix = new int[n];
        prifix[0] = nums[0];
        int[] sufix = new int[n];
        sufix[n - 1] = nums[n - 1];
        
        // Compute prefix sums
        for (int i = 1; i < n; i++) {
            prifix[i] = prifix[i - 1] + nums[i];
        }
        
        // Compute suffix sums
        for (int j = n - 2; j >= 0; j--) {
            sufix[j] = sufix[j + 1] + nums[j];
        }
        
        // Find pivot index
        for (int i = 0; i < n; i++) {
            if (prifix[i] == sufix[i]) {
                return i;
            }
        }
        
        return -1; // No pivot index found
    }
}

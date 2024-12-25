class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;  // Store the product of all elements before index i
            prefix *= nums[i];  // Update prefix
        }

        // Step 2: Calculate suffix products and combine with prefix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;  // Combine with the prefix product
            suffix *= nums[i];  // Update suffix
        }

        return answer;
    }

   
}
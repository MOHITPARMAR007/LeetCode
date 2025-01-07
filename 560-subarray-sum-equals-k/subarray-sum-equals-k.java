class Solution {
    public int subarraySum(int[] arr, int k) 
    {
        int count = 0;           // Count of subarrays with sum k
        int sum = 0;             // Running prefix sum
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        // Initialize the map with a zero prefix sum
        prefixSumMap.put(0, 1);  // This handles cases where a subarray starts at index 0

        // Iterate through the array
        for (int num : arr) {
            sum += num;  // Update the running prefix sum

            // Check if (sum - k) exists in the map
            if (prefixSumMap.containsKey(sum - k)) {
                count += prefixSumMap.get(sum - k);  // Add the count of such prefix sums
            }

            // Add the current prefix sum to the map
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return count;  // Return the total count of subarrays with sum k
    }
}
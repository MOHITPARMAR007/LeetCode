class Solution {
    public boolean canThreePartsEqualSum(int[] arr) 
    {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if (totalSum % 3 != 0) {
            return false;
        }
        int target = totalSum / 3;
        int currentSum = 0;
        int partitionCount = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum == target) {
                partitionCount++;
                currentSum = 0;
            }
            if (partitionCount == 2 && i < arr.length - 1) {
                return true;
            }
        }
        return false;
    }
}
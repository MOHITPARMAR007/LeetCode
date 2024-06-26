class Solution {
    public int maxSubArray(int[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }
    
    private int divideAndConquer(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        
        int mid = left + (right - left) / 2;
        
        int leftSum = divideAndConquer(nums, left, mid);
        int rightSum = divideAndConquer(nums, mid + 1, right);
        int crossSum = crossingSum(nums, left, mid, right);
        
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
    
    private int crossingSum(int[] nums, int left, int mid, int right) {
        int leftMaxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftMaxSum = Math.max(leftMaxSum, sum);
        }
        
        int rightMaxSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightMaxSum = Math.max(rightMaxSum, sum);
        }
        
        return leftMaxSum + rightMaxSum;
    }
}
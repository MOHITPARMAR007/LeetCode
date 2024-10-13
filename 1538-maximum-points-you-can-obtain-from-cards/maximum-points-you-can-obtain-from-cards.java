class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] prefixSum = new int[n + 1];
        
        // Calculate the prefix sum of the card points
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + cardPoints[i];
        }
        
        int maxScore = 0;
        
        // Try all possible combinations of taking cards from the left and right ends
        for (int i = 0; i <= k; i++) {
            int leftScore = prefixSum[i];
            int rightScore = prefixSum[n] - prefixSum[n - (k - i)];
            maxScore = Math.max(maxScore, leftScore + rightScore);
        }
        
        return maxScore;
    }
}
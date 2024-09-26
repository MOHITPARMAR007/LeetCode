class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];//ider apan ne 0 index pe h buy kar liya 
        int profit = 0;// tho aaaj h bech denge tho profit zero h rahega 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
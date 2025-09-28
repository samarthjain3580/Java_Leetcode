class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = 0, profit = 0;
        for(int i=1; i<n; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            else {
                sell = prices[i];
                profit = Math.max(profit, sell-buy);
            }
        }
        return profit;
    }
}

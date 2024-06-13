package best_time_to_buy_and_sell_stock__0121;

class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0, lowestPrice = Integer.MAX_VALUE;
        for (int x : prices) {
            lowestPrice = Math.min(lowestPrice, x);
            totalProfit = Math.max(totalProfit, x - lowestPrice);
        }
        return totalProfit;
    }
}

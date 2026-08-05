class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPriceSoFar = Math.min(minPriceSoFar, price);
            maxProfit = Math.max(maxProfit, price - minPriceSoFar);
        }

        return maxProfit;
    }
}

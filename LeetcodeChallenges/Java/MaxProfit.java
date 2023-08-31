class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit = -1;
        int buy = 10000;
        // int sell = -1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                for (int j = i; j < prices.length; j++) {
                    if (prices[j] - prices[i] > maxProfit) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices = { 7, 6, 4, 3, 1 };
        int max = maxProfit.maxProfit(prices);
    }
}

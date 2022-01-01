class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int profit = 0;
        for (int i = 1; i<prices.length; i++){
            if (prices[i]>bought){
                if ((prices[i] - bought) > profit){
                    profit = prices[i] - bought;
                } 
            }
            else {
                bought = prices[i];
            }
        }
        return profit; 
    }
}
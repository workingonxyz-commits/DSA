class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int profit=0;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            int p=prices[i];
            min_price=Math.min(min_price,p);
            profit=p-min_price;
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
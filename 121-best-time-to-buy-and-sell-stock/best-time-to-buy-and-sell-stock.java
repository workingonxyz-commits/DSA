class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int p=prices[i];
            minprice=Math.min(minprice,p);
            int profit=p-minprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
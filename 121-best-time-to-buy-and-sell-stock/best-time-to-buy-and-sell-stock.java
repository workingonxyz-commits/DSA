class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int max=0;
        for(int p:prices){
            minprice=Math.min(minprice,p);
            int profit=p-minprice;
            max=Math.max(max,profit);

        }
        return max;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-prices[i-1];

            sum=Math.max(0,sum+diff);
           
            max=Math.max(max,sum);

        }
        return max;
    }
}
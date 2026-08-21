class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        int[] ans=new int[2];
        for(int i=0;i<aliceSizes.length;i++){
            sum1+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sum2+=bobSizes[i];
        }
        int diff = (sum1 - sum2) / 2;

        for (int x : aliceSizes) {
            for (int y :bobSizes) {

                if (x - y == diff) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{};
    }
}
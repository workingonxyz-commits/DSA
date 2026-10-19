class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double max=(double)sum/k;
        for(int j=k;j<nums.length;j++){
            sum=sum+nums[j]-nums[j-k];
            double max2=(double)sum/k;
            max=Math.max(max,max2);
        }
        return max;
    }
}
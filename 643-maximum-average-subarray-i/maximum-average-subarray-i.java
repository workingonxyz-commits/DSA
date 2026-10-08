class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double avg=0;
        
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max = (double) sum / k;
        for(int j=k;j<nums.length;j++){
            sum=sum+nums[j]-nums[j-k];
            avg=(double)sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}
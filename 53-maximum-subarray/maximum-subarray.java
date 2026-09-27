class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
          
            int cs=Math.max(nums[i],sum+nums[i]);
            sum=cs;
            max=Math.max(cs,max);
        }
        return max;
    }
}
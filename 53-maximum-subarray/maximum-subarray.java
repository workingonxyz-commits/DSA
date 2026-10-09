class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int cs=0;
        int max=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            
            cs=Math.max(nums[i],sum+nums[i]);
            sum=cs;
            max=Math.max(max,cs);
        }
        return max;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=Integer.MAX_VALUE;
        int sum=0;
        
        int j=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        
            while(sum>=target){
                size=Math.min(size,i-j+1);
                sum=sum-nums[j];
                j++;
            }
        }
        return size==Integer.MAX_VALUE?0:size;
    }
}
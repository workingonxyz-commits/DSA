class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int res=-1;
        if(nums.length==1){
            return nums[0]==target?0:-1;
        }
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[l]<=nums[m]){
              if(nums[l]<=target&& target<nums[m]){
              h=m-1;
              }else{
                l=m+1;
              }
            }else{
                if(nums[h]>=target && nums[m]<target){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }
        return res;
    }
}
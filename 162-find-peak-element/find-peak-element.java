class Solution {
    public int findPeakElement(int[] nums) {
        int l=1,h=nums.length-2;
        
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        while(l<=h){
            int m=l+(h-l);
            if(nums[m]>nums[m+1]&&nums[m]>nums[m-1]){
                return m;
            }else if(nums[m]<nums[m+1]){
                l=m+1;

            }else{h=m-1;}
        }
        return -1;
    }
}
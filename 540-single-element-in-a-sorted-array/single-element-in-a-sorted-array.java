class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int m=l+(h-l)/2;
            int leftelements=m-l+1,
                rightelements=h-m+1;
            if(nums[m]==nums[m-1]){
                if(leftelements%2==1){
                    h=m-2;
                }else{
                    l=m+1;
                }

            }else if(nums[m]==nums[m+1]){
                if(rightelements%2==1){
                    l=m+2;
                }else{
                    h=m-1;
                }

            }else{
                return nums[m];
            }
        }
        return nums[l];
    }
}
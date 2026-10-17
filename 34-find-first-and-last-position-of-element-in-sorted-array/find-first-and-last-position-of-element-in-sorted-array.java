class Solution {
    public int firstocc(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                ans=m;
                h=m-1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return ans; 
    }
    public int lastocc(int[] nums, int target){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                ans=m;
                l=m+1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a=firstocc(nums, target);
        if(a==-1){
            return new int[]{-1,-1};
        }
        int b=lastocc(nums,target);
        return new int[]{a,b};
    }
}
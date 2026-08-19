class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int a=0;
        int b=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[a]=nums[i];
                a=a+2;
            }
            else{
                res[b]=nums[i];
                b=b+2;
            }
        }
        return res;
    }
}
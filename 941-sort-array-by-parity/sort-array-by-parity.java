class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans =new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n%2==0){
                ans[c]=n;
                c++;
            }
        }
        for(int j=0;j<nums.length;j++){
            int n=nums[j];
            if(n%2!=0){
                ans[c]=n;
                c++;
            }
        }
        return ans;
    }
}
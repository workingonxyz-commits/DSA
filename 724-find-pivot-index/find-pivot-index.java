class Solution {
    public int pivotIndex(int[] nums) {
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){lsum[i]=0;}
            else{
                lsum[i]=lsum[i-1]+nums[i-1];
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){rsum[j]=0;}
            else{
                rsum[j]=rsum[j+1]+nums[j+1];
            }
        }
        int ans=-1;
        for(int k=0;k<nums.length;k++){
            if(lsum[k]==rsum[k]){
                return k;
            }
        }
        return ans;
    }
}
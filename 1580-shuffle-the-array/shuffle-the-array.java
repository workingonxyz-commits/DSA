class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=n;
        int d=0;
        
        for( i=0;i<n;i=i+1){
            ans[d]=nums[i];
            d=d+2;
        }
        d=1;
        for( j=n;j<nums.length;j=j+1){
            
            ans[d]=nums[j];
            d=d+2;
        }
         
        
    return ans;
    }
}
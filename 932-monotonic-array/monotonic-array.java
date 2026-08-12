class Solution {
    public boolean isMonotonic(int[] nums) {
        int n1=nums.length;
        return (dec(nums,n1))||(inc(nums,n1));
      
    
    
   

    
}
    
    public boolean inc(int[] nums,int n1){
     for(int i=0;i<n1-1;i++){
            if(nums[i]>nums[i+1]){
               return false;
            }
        }
        return true;
    } 
    public boolean dec(int[] nums,int n1){
         for(int i=0;i<n1-1;i++){
            if(nums[i]<nums[i+1]){
               return false;
            }
        }
        return true;
    }
}
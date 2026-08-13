class Solution {
    public int findNumbers(int[] nums) {
        
        int c2=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int a=nums[i];
            while(a>0){
            int d=a%10;
            c++;
            a=a/10;
            }
            
            if(c%2==0){
               c2=c2+1;
                
            }
        }
        return c2;
    }
}
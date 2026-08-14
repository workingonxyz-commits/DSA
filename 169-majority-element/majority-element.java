class Solution {
    public int majorityElement(int[] nums) {
        int n=(nums.length);
        int count=1;
        int element=nums[0];

        for(int i=1;i<nums.length;i++){
            //element=nums[i];
            if(nums[i]==element){
            count=count+1;
            }
            else{
                count--;
            }
            if(count==0){
                element=nums[i];
                count=1;
            }
        }
        
            return element;
        
    
}
}
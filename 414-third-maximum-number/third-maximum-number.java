import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            if(nums[0]>nums[1]){
                return nums[0];
            }else{
                return nums[1];
            }
        }
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i]==max1 || nums[i]==max2 || nums[i]==max3){
                continue;
            }
            if(nums[i]>max1){
                max3=max2;
                max2=max1; 
                max1=nums[i];
                 
            }
            else if( nums[i]>max2){
                max3=max2;
                max2=nums[i];
                
            }
            else if(nums[i]>max3){
                max3=nums[i];
            }

        }
        if(max3==Long.MIN_VALUE){
            return (int)max1;
        }else{
            return (int)max3;
        }
        
        
    }
}
import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        int max1=(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        int max2=nums[0]*nums[1]*nums[nums.length-1];
                return Math.max(max1,max2);

    }
}
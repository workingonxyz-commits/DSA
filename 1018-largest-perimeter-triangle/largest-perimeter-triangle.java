class Solution {
    public int largestPerimeter(int[] nums) {
        int len=nums.length;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int max=0;
        int i=len-1;
        int sum=0;
        while(i>=2){
            if(nums[i]<nums[i-1]+nums[i-2])
                    {
                        sum= nums[i]+nums[i-1]+nums[i-2];
                        if(max<sum){
                            max=sum;
                        }
                    }
            i--;
        }
    return max;
    }

}
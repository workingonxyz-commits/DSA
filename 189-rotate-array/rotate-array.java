class Solution {
    public void rotate(int[] nums, int k) {
        int[] res=new int[nums.length];
        int s=0;
        if(nums.length == 0) return;

        k = k % nums.length;
        for(int i=nums.length - k;i<nums.length;i++){
            res[s++]=nums[i];
        }
        for(int j=0;j<nums.length - k;j++){
            res[s++]=nums[j];
        }
        
        for(int a=0;a<nums.length;a++){
            nums[a]=res[a];
        }

    }
}
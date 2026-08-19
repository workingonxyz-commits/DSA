class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int[] res=new int[nums.length];
        arr1[0]=0;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            arr1[j]=arr1[j-1]+nums[i];
            j++;
        }

        int k=nums.length-2;
        arr2[nums.length-1]=0;
        for(int i=nums.length-1;i>0;i--){
            arr2[k]=arr2[k+1]+nums[i];
            k--;
        }

        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(arr1[i]-arr2[i]);
        }
        return res;

    }
}
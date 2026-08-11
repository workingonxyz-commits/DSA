class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=2*n;
        int arr[]=new int[m];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j++]=nums[i];
        }
        for(int i=0;i<n;i++){
           arr[j++]=nums[i]; 
        }
    return arr;
    }
}
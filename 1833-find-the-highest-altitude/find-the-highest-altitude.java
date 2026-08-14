class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        int max=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }

        }
        return max;
    }
}
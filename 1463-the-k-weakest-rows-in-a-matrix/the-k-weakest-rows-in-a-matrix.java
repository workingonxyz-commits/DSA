class Solution {
    public int binarysearch(int[] arr){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(arr[m]==1){
                l=m+1;
            }else{
                h=m;
            }
        }
        return arr[l]==1?arr.length:l;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rowdetails=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            rowdetails[i][0]=binarysearch(mat[i]);
            rowdetails[i][1]=i;
        }
        Arrays.sort(rowdetails,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=rowdetails[i][1];
        }
        return res;
    }
}
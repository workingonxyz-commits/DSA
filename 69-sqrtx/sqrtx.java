class Solution {
    public int mySqrt(int x) {
        int l=0;
        if(x<2){
            return x;
        }
        int h=x/2;
        int res=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if((long)m*m==x){
                return m;
            }else if((long)m*m<x){
                res=m;
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return res;
    }
}
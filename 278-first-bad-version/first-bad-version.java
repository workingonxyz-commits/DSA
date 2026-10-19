/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int h=n-1;
        int res=n;
        while(l<=h){
            int m=l+(h-l)/2;
            if(isBadVersion(m)){
                res=m;
                h=m-1;
            }
            else{
                l=m+1;

            }
        }
        return res;
    }
}
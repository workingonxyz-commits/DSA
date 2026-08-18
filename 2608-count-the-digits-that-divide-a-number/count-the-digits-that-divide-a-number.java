class Solution {
    public int countDigits(int num) {
        int max=0;
        int n=num;
        int count=0;
        while(n>0){
            int t=n%10;
            if(num%t==0){
                count++;
                max=count;
            }
            n=n/10;
        }
        return max;
    }
}
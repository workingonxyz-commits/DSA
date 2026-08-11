class Solution {
    public boolean isPalindrome(int x) {
        
        int rev=0;
        int a=0;
        int b=x;
        while(b>0){
            a=b%10;
            b=b/10;
            rev=rev*10+a;
        }
        if(x!=rev){
            return false;
        }
    return true;
    }
}
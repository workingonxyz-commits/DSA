class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        char[] s2=new char[s.length];
        int a=0;
        for(int i=len-1;i>=0;i--){
            s2[a]=s[i];
            a++;
        }
        for(int i=0;i<len;i++){
            s[i]=s2[i];
        }
         
    }
}
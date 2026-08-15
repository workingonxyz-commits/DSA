class Solution {
    public String reversePrefix(String s, int k) {
        int len=s.length();
        String s1=s.substring(0,k);
        String s2=s.substring(k,len);
        String rev="";
        for(int i=s1.length()-1;i>=0;i--){
                rev=rev+s.charAt(i);

        }
        rev=rev+s2;
        return rev;
    }
}
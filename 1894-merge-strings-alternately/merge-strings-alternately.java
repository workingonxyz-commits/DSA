class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int len=len1+len2;
        int max=Math.min(len1,len2);
        String str="";
        int c=0;
        int i=0;
        int j=0;
        while(c<max){
            str=str+word1.charAt(i);
            i++;
            str=str+word2.charAt(j);
            j++;
            c++;
        }
        while(i<len1){
            str=str+word1.charAt(i);
            i++;
        }
        while(j<len2){
            str=str+word2.charAt(j);
            j++;
        }
        
        return str;
        
    }
}
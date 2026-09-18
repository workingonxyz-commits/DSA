class Solution {
    public boolean isAnagram(String s, String t) {
       int[] freq=new int[26];
       if(s.length()!=t.length()){
        return false;
       }
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch-'a']++;
       } 
       int[] freq2=new int[26];
       for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        freq2[ch-'a']++;
       }
       for(int i=0;i<26;i++){
        if(freq[i]!=freq2[i]){
            return false;
        }
       }
       return true;
    }
}
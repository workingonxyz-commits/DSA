class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq1[ch-'a']++;
        }
        int[] freq2=new int[26];
        for(int j=0;j<t.length();j++){
            char ch2=t.charAt(j);
            freq2[ch2-'a']++;
        }
        for(int k=0;k<26;k++){
            if(freq1[k]!=freq2[k]){
                return false;
            }
        }
        return true; 
    }
}
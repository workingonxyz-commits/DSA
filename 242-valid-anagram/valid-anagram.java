class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int[] freq2=new int[26];
        for(int j=0;j<t.length();j++){
            char ch2=t.charAt(j);
            freq2[ch2-'a']++;
        }
        for(int k=0;k<freq.length;k++){
            if(freq[k]!=freq2[k]){
                return false;
            }
        }
        return true;
    }
}
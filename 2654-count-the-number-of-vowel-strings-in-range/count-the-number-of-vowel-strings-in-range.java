class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        
        for(int i=left;i<=right;i++){
            String a1=words[i];
            if((a1.charAt(0)=='a'||a1.charAt(0)=='e'||a1.charAt(0)=='i'||a1.charAt(0)=='o'||a1.charAt(0)=='u')
            &&
            (a1.charAt(a1.length()-1)=='a'||a1.charAt(a1.length()-1)=='e'||a1.charAt(a1.length()-1)=='i'||a1.charAt(a1.length()-1)=='o'||a1.charAt(a1.length()-1)=='u')){
                count++;
            }
        }
        return count;
    }
}
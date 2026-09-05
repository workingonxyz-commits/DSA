class Solution {
    public String reverseWords(String s) {
        //String[] word=new String[s.length()];
        StringBuilder str=new StringBuilder();
        String[] word = s.split(" ");
        for(int i=0;i<word.length;i++){
            int len=word[i].length();
            str = new StringBuilder(word[i]);
            str=str.reverse();
            word[i]=str.toString();
        }
        String res="";
        for(int i=0;i<word.length;i++){
            res=res+word[i];
            res=res+" ";
        }
        res=res.trim();
        return res;
    }
}
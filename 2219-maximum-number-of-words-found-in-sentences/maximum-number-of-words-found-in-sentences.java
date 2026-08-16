class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=0;
        String s2="";
         
        for(int i=0;i<sentences.length;i++){
            
            //String[] f=new String[.length()]
            String[] s=sentences[i].split("\\s+");
            if(s.length>max){
                max=s.length;
            }
        }
        return max;
    }
}
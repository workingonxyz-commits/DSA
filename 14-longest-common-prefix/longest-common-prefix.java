class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        for(int i=0;i<strs[0].length();i++){
            String LCP=strs[0].substring(0,i+1);
            for(int j=1;j<strs.length;j++){
                if(strs[j].indexOf(LCP)!=0){
                    return res;
                }
            }
            res=LCP;
        }
        return res;
    }
}
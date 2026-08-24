class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26];
        int len=sentence.length();
        int i=0;
        while(len>0){
            int ch=sentence.charAt(i);
            arr[ch-'a']=true;
            i++;
            len--;
        }
        for(int j=0;j<arr.length;j++){
            if(!arr[j]){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String restoreString(String s, int[] indices) {
        String str="";
        int l=s.length()-1;
        char[] arr=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);   
        }
        return new String(arr);
    }
}
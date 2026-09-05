class Solution {
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        int st=0;
        for(int e=0;e<=ch.length;e++){
            if(e==ch.length||ch[e]==' '){
                int l=st;
                int r=e-1;
                while(l<r){
                    char temp=ch[l];
                    ch[l]=ch[r];
                    ch[r]=temp;
                    l++;
                    r--;
                }

               st=e+1; 
            }
        }
        return new String(ch);
    }
}
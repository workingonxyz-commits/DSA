class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        s=s.trim();
        int len=s.length()-1;
        int count1=0;
        int count2=0;
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<=(len/2);i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                count1++;
            }
        }
        for(int i=(len/2+1);i<s.length();i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
    }
}
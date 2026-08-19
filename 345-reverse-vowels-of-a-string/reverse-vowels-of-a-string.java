class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                str.append(s.charAt(i));
            }
        }

        str.reverse();

        int fu=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                arr[i]=str.charAt(fu);
                fu++;  
            }
        }
        String s2="";
        for(int i=0;i<arr.length;i++){
            s2=s2+arr[i];
        }
       
    return s2;

    }
}
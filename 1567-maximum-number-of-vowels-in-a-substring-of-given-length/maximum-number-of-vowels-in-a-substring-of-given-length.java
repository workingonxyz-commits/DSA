class Solution {
    public int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
        char[] res=new char[k];
        int count=0;
        int max=0;
        if(s.length()==1){
            if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
                return 1;
            }else{
                return 0;
            }
        }
        for(int i=0;i<k;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                count++;
                
            }
        }
        max=count;
        for(int j=k;j<arr.length;j++){
            if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'){
                count++;
                
            }
            if(arr[j-k]=='a'||arr[j-k]=='e'||arr[j-k]=='i'||arr[j-k]=='o'||arr[j-k]=='u'){
                count--;
                
            }
            max=Math.max(max,count);
            if (max == k) {
                return k;
            }

        }
        return max;
    }
}
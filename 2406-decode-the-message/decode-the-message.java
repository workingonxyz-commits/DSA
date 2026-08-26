class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character,Character> map=new HashMap<>();
        char ch='a';
        char[] char1=new char[26];
        for(int i=0;i<26;i++){
            char1[i]=ch;
            ch++;
        }
        char[] keyarr=key.toCharArray();
        String keyfinal="";
        for(int i=0;i<key.length();i++){
            if(keyarr[i]!=' '){
                keyfinal+=keyarr[i];
            }
            
        }
        int z=0;
        for(int i=0;i<keyfinal.length();i++){
            if(!map.containsKey(keyfinal.charAt(i))){
            map.put(keyfinal.charAt(i),char1[z]);
            z++;
            }
        }
        String res="";
        
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                res=res+" ";
                
            }
            else {
                res=res+map.get(message.charAt(i));
               
            }
        }
        return res;
    }
}
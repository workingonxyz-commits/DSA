class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int i=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(i))){
            if(map.get(s.charAt(i))==1){
                return i;
            }
            i++;
            }
        }
        return -1;
    }
}
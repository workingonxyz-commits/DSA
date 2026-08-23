class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map=new HashMap<>();
        String[] arr2=s.split(" ");
        char[] arr1=pattern.toCharArray();
        if(pattern.length()!=arr2.length){
            return false;
        }

        for(int i=0;i<arr1.length;i++){
            char ch=pattern.charAt(i);
            String word=arr2[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }else{
                if(map.containsValue(word)){
                    return false;
                }
                map.put(ch,word);
            }
        }
       return true; 

    }
}
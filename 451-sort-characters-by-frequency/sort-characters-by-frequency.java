class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> set=new TreeMap<>();
        
        for(int i=0;i<s.length();i++){
           if(set.containsKey(s.charAt(i))){
            set.put(s.charAt(i),set.get(s.charAt(i))+1);
           
           }else
           set.put(s.charAt(i),1);
        }
        String str="";
        while(!set.isEmpty()){
        int max=0;
        char k='a';
        
        for(Map.Entry<Character,Integer> entry:set.entrySet()){
            
                 if(max<entry.getValue()){
                    max=entry.getValue();
                    k=entry.getKey();
                 } 
                 
                    
        }
        while(max>0){
                    str+=k;
                    max--;
                 }
        set.remove(k);
    }  
    return str;
    }
}
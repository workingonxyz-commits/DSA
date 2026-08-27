class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        s1=s1.trim();
        s2=s2.trim();
    String[] s1arr=s1.split("\\s+");
    String[] s2arr=s2.split("\\s+");
    HashMap<String,Integer> map=new HashMap<>();
    for(int i=0;i<s1arr.length;i++){
        if(map.containsKey(s1arr[i])){
            map.put(s1arr[i],map.get(s1arr[i])+1);
        }else{
            map.put(s1arr[i],1);
        }
    }
    for(int i=0;i<s2arr.length;i++){
        if(map.containsKey(s2arr[i])){
            map.put(s2arr[i],map.get(s2arr[i])+1);
        }else{
            map.put(s2arr[i],1);
        }
    }
    String res="";
    for(Map.Entry<String,Integer> entry:map.entrySet()){
        if(entry.getValue()==1){
            res=res+entry.getKey();
            res+=" ";
        }
    }
    res=res.trim();
    if(res.length()==0){
        return new String[0];
    }else{
        String[] resarr=res.split("\\s+");
    return resarr;
    }
    
    }
}
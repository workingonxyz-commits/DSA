class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{map.put(arr[i],1);}
        }
        HashSet<Integer> h1=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            h1.add(entry.getValue());
        }
        if(h1.size()==map.size()){
            return true;
        }else{return false;}
        
    }
}
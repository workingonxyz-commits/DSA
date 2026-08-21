class Solution {
    public int digitFrequencyScore(int n) {
        int a=n;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(a>0){
            int temp=a%10;
            a=a/10;
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            count+=(entry.getKey()*entry.getValue());
        }
        return count;
    }
}
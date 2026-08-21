class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> m1=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(m1.containsKey(nums[i])){
            m1.put(nums[i],m1.get(nums[i])+1);
        }else{m1.put(nums[i],1);}
       }
       int maxf=0;
       for(Map.Entry<Integer,Integer> entry:m1.entrySet()){
            if(maxf<entry.getValue()){
                maxf=entry.getValue();
            }
       }
       int sum=0;
       for(Map.Entry<Integer,Integer> entry:m1.entrySet()){
            if(entry.getValue()==maxf){
                    sum=sum+entry.getValue();
            }
            
       }
       return sum;
    }
}
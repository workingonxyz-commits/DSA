class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            }else{map.put(nums[i],0);}
        }
        if(nums.length==1){return nums[0];}
        int res=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=1 && entry.getValue()>=(nums.length)/2){
                res=entry.getKey();
                return res;
            }
        }
        
        return -1;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int check=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{map.put(nums[i],1);}
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if((entry.getValue())>check){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}
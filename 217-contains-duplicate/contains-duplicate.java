class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean a=false;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                a= true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return a;

    }
}
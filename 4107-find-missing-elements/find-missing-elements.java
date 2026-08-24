class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int l=Integer.MAX_VALUE;
        int h=0;
        for(int i=0;i<nums.length;i++){
            if(l>nums[i]){
                l=nums[i];
            }
            if(h<nums[i]){h=nums[i];}
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        List<Integer> arr=new ArrayList<>();
        for(int i=l;i<=h;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}
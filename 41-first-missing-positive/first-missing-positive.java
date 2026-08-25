class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int i=1;
        boolean num=true;
        int res=0;
        while(num){
            if(set.contains(i)){
                i++;
            }
            else{
                num=false;
                res=i;
            }
        }
        return res;
    }
}
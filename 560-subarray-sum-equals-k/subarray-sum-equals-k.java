class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res=0;
        int need=0;

        for(int num:nums){
            sum=sum+num;
            need=sum-k;
            res=res+map.getOrDefault(need,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
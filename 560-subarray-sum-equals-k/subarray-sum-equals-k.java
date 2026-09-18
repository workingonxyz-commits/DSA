class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int need=sum-k;
            if (sum == k) {count++;}

            if(map.containsKey(need)) {
                count=count + map.get(need);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
        }

        return count;
    }
}
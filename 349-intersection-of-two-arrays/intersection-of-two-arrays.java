class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=Math.min(nums1.length,nums2.length);
        int idx=0;
        int[] res=new int[len];
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num2:nums2){
            if(map.containsKey(num2)){
                res[idx]=num2;
                idx++;
                map.remove(num2);
            }
        }
        return Arrays.copyOf(res,idx);
    }
}
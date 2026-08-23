class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int a1:nums1){
            s1.add(a1);
        }
        for(int a2:nums2){
            s2.add(a2);
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<nums1.length;i++){
            if(s2.contains(nums1[i])){
                    count1++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(s1.contains(nums2[i])){
                    count2++;
            }
        }
        return new int[]{count1,count2};
    }
}
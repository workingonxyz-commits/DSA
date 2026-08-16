class Solution {
    public int lengthOfLastWord(String s) {
        String[] nums=s.split(" ");
        String s1= nums[nums.length-1];
        return s1.length();
    }
}
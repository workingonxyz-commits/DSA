class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            while(map.containsKey(s.charAt(i))){
                map.remove(s.charAt(l));
                l++;
            }
            map.put(s.charAt(i),1);
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            while(map.containsKey(s.charAt(i))){
                map.remove(s.charAt(l));
                l++;
            }
            map.put(s.charAt(i),1);
            res=Math.max(res,i-l+1);

        }
        return res;
    }
}
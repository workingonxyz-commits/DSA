import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        
        int ans = 0;
        
        for(int num:nums)
        {
            int count = m.getOrDefault(num,0);
            ans=ans+count;
            m.put(num,count+1);
        }
        return ans;
    }
}
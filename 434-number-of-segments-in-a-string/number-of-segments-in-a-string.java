class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }else{
        String[] nums=s.split("\\s+");
        
        return nums.length;
        }
    }
}
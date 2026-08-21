class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){return false;}
        String str=s+s;
        int ans=str.indexOf(goal);
        if(ans==-1){
            return false;
        }else
            {return true;}
    }
}
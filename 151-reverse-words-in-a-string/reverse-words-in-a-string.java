class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+");
        String nums="";
        for(int i=arr.length-1;i>=0;i--){
            nums=nums+arr[i];
            nums=nums+" ";
        }
        nums=nums.trim();
        return nums;
    }
}
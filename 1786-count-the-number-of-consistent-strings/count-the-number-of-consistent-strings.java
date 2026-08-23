class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(int j=0;j<words.length;j++){
            for(int k=0;k<words[j].length();k++){
            if(!set.contains(words[j].charAt(k))){
                count--;
                break;
            }
            
        }
        count++;
    }
    return count;
}
}
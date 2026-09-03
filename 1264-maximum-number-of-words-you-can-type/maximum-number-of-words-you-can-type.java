class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       
        HashSet<Character> s2=new HashSet<>();
        String[] str1=text.split(" ");
        
        for(int i=0;i<brokenLetters.length();i++){
            s2.add(brokenLetters.charAt(i));
        }
        int count=0;
        for(String words:str1){
            for(int i=0;i<words.length();i++){
                if(s2.contains(words.charAt(i))){
                    count++;
                    break;
                }
            }
        }
        return str1.length-count;
    }
}
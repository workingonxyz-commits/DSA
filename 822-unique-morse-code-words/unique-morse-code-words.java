class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map=new HashMap<>();
        char ch='a';
        String[] str={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<26;i++){
            map.put(ch++,str[i]);
           
        }
        HashSet<String> set=new HashSet<>();
        int z=0;
        
        for(int i=0;i<words.length;i++){
            String res="";
            for(int j=0;j<words[i].length();j++){
                res+=map.get(words[i].charAt(j));
                
            }
            set.add(res);
        }
        return set.size();
    }
}
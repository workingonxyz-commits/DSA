class Solution {
    public int maxFreqSum(String s) {
        int len=s.length();
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            char cons=s.charAt(i);
            if(m1.containsKey(cons)){
                m1.put(cons,m1.get(cons)+1);
            }else{
                m1.put(cons,1);
            }

            

            }else{
                char cons=s.charAt(i);
            if(m2.containsKey(cons)){
                m2.put(cons,m2.get(cons)+1);
            }else{
                m2.put(cons,1);
            }
            }
        }

            int max1=0;
            int max2=0;

            for(Map.Entry<Character,Integer> entry:m1.entrySet()){
                if(entry.getValue()>max1){
                    max1=entry.getValue();
                }
            }
            for(Map.Entry<Character,Integer> entry:m2.entrySet()){
                if(entry.getValue()>max2){
                    max2=entry.getValue();
                }
            }
            return max1+max2;

            
    }
}
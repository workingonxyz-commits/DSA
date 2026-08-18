class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            if(all(num)){
                 l.add(i);
            }
            
           
        }
        return l;
    }
    public static boolean all(int num){
        int j=num;
        while(num>0){
            int single=num%10;
            if(single==0){
               return false;
            }
            else if(j%single!=0){
                return false;
            } 
            num=num/10;
        }
        return true;
    }
}
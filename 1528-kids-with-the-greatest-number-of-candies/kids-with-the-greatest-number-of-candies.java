class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=0;
         int j=0;
       for( j=0;j<candies.length;j++){
                if(candies[j]>max){
                    max=candies[j];
                }

        }
        for(int i=0;i<candies.length;i++){
            int curr=candies[i];
            int total=curr+extraCandies;
            if(total>=max){
            l.add(true);
            }else{
                l.add(false);
            }
        }
    return l;
    }
}
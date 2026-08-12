class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> l=new ArrayList<>();
        
        //if(mountain[0]>mountain[1]){
        //    l.add(0);
        //}
        for(int i=1;i<mountain.length-1;i++){
           if((mountain[i]>mountain[i-1])&&(mountain[i]>mountain[i+1])){
            l.add(i);
           } 
        }
        //if(mountain[mountain.length-1]>mountain[mountain.length-2]){
        //    l.add(mountain.length-1);
        //}
        return l;
    }
}
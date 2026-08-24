class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        String[] arr=new String[names.length];
        int z=0;
        for(int i=0;i<heights.length;i++){
            arr[z]=map.get(heights[i]);
            z++;
        }
        //for(Map.Entry<Integer,String> entry:map.entrySet()){
        //    arr[z]=entry.getValue();
        //    z++;
        //}
        return arr;
    }
}
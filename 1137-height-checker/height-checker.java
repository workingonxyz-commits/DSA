class Solution {
    public int heightChecker(int[] heights) {
        int[] exp=new int[heights.length];

        for(int i=0;i<heights.length;i++){
            exp[i]=heights[i];
        }
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=exp[i]){
                count++;
            }
        }
        return count;
    }
}
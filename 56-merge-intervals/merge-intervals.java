class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last=list.get(list.size()-1);
            int[] interval=intervals[i];
            if(interval[0]<=last[1]){
                last[0]=Math.min(last[0],interval[0]);
                last[1]=Math.max(last[1],interval[1]);
            }else{
                list.add(intervals[i]);
        }
    }
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
                res[i]=list.get(i);
        }
        return res;
    }
}
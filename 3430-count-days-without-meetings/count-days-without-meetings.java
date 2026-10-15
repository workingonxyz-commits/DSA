class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;
        List<int[]> list=new ArrayList<>();
        
        if (meetings.length == 0){
            return days;
        }
        list.add(meetings[0]);
        for(int i=1;i<meetings.length;i++){
            int[] last=list.get(list.size()-1);
            int[] interval=meetings[i];

            if(last[1]<interval[0]){
                int sum= interval[0] - last[1] - 1;
                count=count+sum;
                list.add(interval);
            }else {
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        
        count += days - list.get(list.size() - 1)[1];
        count += meetings[0][0] - 1;
        return count;
    }
}
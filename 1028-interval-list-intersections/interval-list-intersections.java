class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {   Arrays.sort(firstList,(a,b)->(Integer.compare(a[0],b[0])));
        Arrays.sort(secondList,(a,b)->(Integer.compare(a[0],b[0])));
       

       if(firstList.length==0||secondList.length==0){
        return new int[0][2];
       }
       List<int[]> list=new ArrayList<>();
       int i = 0;
       int j = 0;

        while (i < firstList.length && j < secondList.length) {

            int[] interval = firstList[i];
            int[] last = secondList[j];

            int start = Math.max(interval[0], last[0]);
            int end = Math.min(interval[1], last[1]);

            if (start <= end) {
                list.add(new int[]{start, end});
            }

            if (interval[1] < last[1]) {
                i++;
            } else {
                j++;
            }
        }
        int[][] res = new int[list.size()][2];

        for (int k = 0; k < res.length; k++) {
            res[k] = list.get(k);
        }

       return res;
    }
}
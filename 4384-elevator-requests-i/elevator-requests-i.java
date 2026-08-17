class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int a=0;
        int sum=requests[0];
        
        for(int i=1;i<requests.length;i++){
            a=Math.abs(requests[i-1]-requests[i]);
            sum+=a;
        }
        return sum;
    }
}
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int max=0;
        int b=0;
        boolean a=true;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                b=i;
            }
        }
        if(b==0){
            return false;
        }
        if(b==n-1){
            return false;
        }

        //if(arr[0]<arr[1])
        for(int i=1;i<b;i++){
                if(arr[i-1]>=arr[i]){
                    return false;
                }
              
        }
         for(int i=b;i<n-1;i++){
                if(arr[i]<=arr[i+1]){
                    return false;
                }
        }

            
    return true;
        
    }
}
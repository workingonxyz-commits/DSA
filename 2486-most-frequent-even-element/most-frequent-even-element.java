class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                

            }else{map.put(nums[i],1);}
        }
        }
int res=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               int key= entry.getKey();
               int value=entry.getValue();
               if(value>max){
                    max=value;
                    res=key;

               }
               else if(value==max && key<res){
                res=key;
               }
        }
    return res;
    }

}
class Solution {
    public String kthDistinct(String[] arr, int k) {

        LinkedHashMap<String, Integer> m1 = new LinkedHashMap<>();

        
        for(int i = 0; i < arr.length; i++) {

            if(m1.containsKey(arr[i])) {
                m1.put(arr[i], m1.get(arr[i]) + 1);
            }
            else {
                m1.put(arr[i], 1);
            }
        }

       
        for(Map.Entry<String, Integer> entry : m1.entrySet()) {

            if(entry.getValue() == 1) {
                k--;

                if(k == 0) {
                    return entry.getKey();
                }
            }
        }

        return "";
    }
}
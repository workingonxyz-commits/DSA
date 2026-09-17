class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long max = 0;
        int dup = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            sum += nums[i];

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
                dup++;
            }
        }

        if (dup == 0) {
            max=Math.max(max,sum);
        }

        for (int i = k; i < nums.length; i++) {

            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            sum += numToAdd;

            if (!map.containsKey(numToAdd)) {
                map.put(numToAdd, 0);
            } else {
                map.put(numToAdd, map.get(numToAdd) + 1);
                dup++;
            }

            sum -= numToRemove;

            if (map.get(numToRemove) > 0) {
                map.put(numToRemove, map.get(numToRemove) - 1);
                dup--;
            } else {
                map.remove(numToRemove);
            }

            if (dup == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
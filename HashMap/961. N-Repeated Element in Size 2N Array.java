class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int val: map.keySet()) {
            if (map.get(val) == n/2) return val;
        }

        return -1;
    }
}

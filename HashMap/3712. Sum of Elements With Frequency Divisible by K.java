class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        } 

        int sum = 0;
        for(int i:map.keySet()) {
            int var = map.get(i);
            if (var%k == 0) {
                sum += var*i;
            }
        }
        
        return sum;
    }
}

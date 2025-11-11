class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i: nums) {
            if (i%2 == 0) {
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
        if (map.isEmpty()) return -1;

        int max = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) return entry.getKey();
        }

        return -1;

    }
}

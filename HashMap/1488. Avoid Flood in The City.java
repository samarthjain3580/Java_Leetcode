class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] > 0) {
                ans[i] = -1;
                int lake = rains[i];

                if (map.containsKey(lake)) {
                    Integer temp = set.higher(map.get(lake));
                    if (temp == null) return new int[0]; 
                    ans[temp] = lake;
                    set.remove(temp);
                }
                map.put(lake, i);
            } else {
                set.add(i);
                ans[i] = 1;
            }
        }
        return ans;
    }
}

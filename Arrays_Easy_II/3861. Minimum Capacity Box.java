class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if (capacity[i] >= itemSize) {
                min = Math.min(min, capacity[i]);
            }
        }

        for(int i=0; i<n; i++) {
            if (capacity[i] == min) return i;
        }

        return -1;
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;

        for (int i=0; i<cost.length; i++) {
            total += gas[i] - cost[i];
        }
        
        if (total<0) return -1;

        int idx = 0;
        int current = 0;
        for (int i=0; i<cost.length; i++) {
            current += gas[i] - cost[i];
            if (current<0) {
                current = 0;
                idx = i+1;
            }
        }
        return idx;
    }
}

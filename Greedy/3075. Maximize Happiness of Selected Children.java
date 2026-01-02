class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length-1, i = 0;
        long val = 0;
        while(k-->0) {
            long curr = happiness[n-i]-i;
            if (curr > 0) {
                val+=curr;
                i++;
            }
        }
        return val;
    }
}

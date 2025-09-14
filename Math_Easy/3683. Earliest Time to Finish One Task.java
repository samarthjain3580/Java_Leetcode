class Solution {
    public int earliestTime(int[][] tasks) {
        int max = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<tasks.length; i++) {
            sum += tasks[i][0] + tasks[i][1];
            sum = Math.min(sum,max);
            max = sum;
            sum = 0;
        }
        return max;
    }
}

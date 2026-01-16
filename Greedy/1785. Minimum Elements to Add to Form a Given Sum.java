class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int num :nums) sum+=num;

        long x = goal-sum;
        if (x == 0) return 0;

        long a = Math.abs(x);
        long count = (a + limit - 1) / limit;

        return (int) count;
    }
}

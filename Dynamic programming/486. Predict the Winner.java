class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=0; i<n; i++) {
            total += nums[i];
        }

        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int player_1 = choose(nums, 0, n-1, dp);
        int player_2 = total - player_1;

        return player_1 >= player_2;
    }

    public int choose(int[] nums, int i, int j, int[][] dp) {

        if (i > j) return 0;
        if (i == j) return nums[i];

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int first = nums[i] + Math.min(choose(nums, i+2, j, dp), choose(nums, i+1, j-1, dp));
        int last = nums[j] + Math.min(choose(nums, i+1, j-1, dp), choose(nums, i, j-2, dp));

        return dp[i][j] = Math.max(first, last);
    }
}

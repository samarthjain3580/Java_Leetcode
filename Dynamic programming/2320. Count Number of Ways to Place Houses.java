class Solution {
    public int countHousePlacements(int n) {
        // we made a series: 2,3,5,8,13,...
        // 1 - 4
        // 2 - 9
        // 3 - 25
        // 4 - 64
        // 5 - 169

        

        int[] dp = new int[n+1];
        int MOD = 1000000007;
        Arrays.fill(dp, -1);
        long var = totalWays(n,dp,MOD);
        return (int)((var * var) % MOD);

    }

    public int totalWays(int n, int[] dp, int MOD) {
        if (n == 1 || n == 2) return n+1;

        if (dp[n] != -1) return dp[n];

        return dp[n] = (totalWays(n-1, dp, MOD) + totalWays(n-2,dp, MOD))%MOD;
    }
}

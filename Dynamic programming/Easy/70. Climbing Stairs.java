class Solution {
    public int climbStairs(int n) {
        //n=1,2,3,4,5,6,7,8
        //o=1,2,3,5,8,13,21,34
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climbingStairs(n, dp);
    }

    public int climbingStairs(int n, int[] dp) {
        if (n==1 || n==2) return n;

        if (dp[n] != -1) return dp[n];

        return dp[n] = climbingStairs(n-1, dp) + climbingStairs(n-2, dp);
    }
}

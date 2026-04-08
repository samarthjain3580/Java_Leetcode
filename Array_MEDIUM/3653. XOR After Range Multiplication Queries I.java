class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1000000007;
        for(int[] query : queries) {
            int idx = query[0];
            while (idx <= query[1]) {
                nums[idx] = (int) (((long)nums[idx] * query[3]) % MOD);
                idx+=query[2];
            }
        }

        int xor = 0;
        for(int num: nums) xor = xor^num;
        return xor;
    }
}

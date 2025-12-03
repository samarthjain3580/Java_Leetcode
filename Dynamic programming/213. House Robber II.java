class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int ans = Math.max(robbery(nums, 0,n-2), robbery(nums, 1, n-1));
        return ans;
    }

    public int robbery(int[] nums, int start, int end) {
        int prev_2 = 0, prev_1 = 0;

        for(int i=start; i<=end; i++) {
            int rob = nums[i] + prev_2;
            int curr = Math.max(rob, prev_1);

            prev_2 = prev_1;
            prev_1 = curr;
        }

        return prev_1;
    }
}

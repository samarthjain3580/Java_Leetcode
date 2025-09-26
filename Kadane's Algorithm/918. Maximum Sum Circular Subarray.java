class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int sum = nums[0], max = nums[0];
        for (int num : nums) {
            total += num;
        }

        int maxSum = Maxsubarray(nums, sum, max); 
        int minSum = Minsubarray(nums, sum, max);  

        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, total - minSum);
    }

    public int Maxsubarray(int[] nums, int sum, int max) {
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public int Minsubarray(int[] nums, int sum, int min) {
        for (int i = 1; i < nums.length; i++) {
            sum = Math.min(nums[i], sum + nums[i]);
            min = Math.min(min, sum);
        }
        return min;
    }
}

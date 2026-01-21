class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        if (n==1 || n==2) return -1;
        int min = Math.min(nums[0], nums[1]);
        int max = Math.max(nums[0], nums[1]);
        if (nums[2] > max) return max;
        else if (nums[2] < min) return min;
        return nums[2]; 
    }
}

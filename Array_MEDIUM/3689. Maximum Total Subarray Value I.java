class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];

        return (long) (max-min)*k;
    }
}

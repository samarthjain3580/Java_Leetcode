class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        for (int i=l; i>1; i--) {
            if (nums[i] < nums[i-1] + nums[i-2]) {
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}

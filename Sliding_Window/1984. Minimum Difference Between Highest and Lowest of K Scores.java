class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = 100000;

        for(int i=0; i+k-1<n; i++) {
            int ans = nums[i+k-1] - nums[i];
            min = Math.min(ans, min);
        }
        return min;
    }
}

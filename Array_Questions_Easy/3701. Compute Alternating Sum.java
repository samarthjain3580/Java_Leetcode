class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i=1; i<n; i+=2) {
            sum-=nums[i];
            sum+=nums[i+1];
        }
        return sum;
    }
}

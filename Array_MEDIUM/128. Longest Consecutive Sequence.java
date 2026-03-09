class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (n==0) return 0;
        int count = 1;
        int max = -1;
        for(int i=0; i<n-1; i++) {
            if (nums[i] == nums[i+1]-1) count++;
            else if (nums[i] == nums[i+1]) continue;
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        return Math.max(max, count);
    }
}

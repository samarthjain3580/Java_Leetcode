class Solution {
    public int longestSubarray(int[] nums) {
        int count = 2, max = 2;
        int i = 0, j = 1, k = 2;
        while(k<nums.length){
            if (nums[i] + nums[j] == nums[k]) {
                count++;
            }
            else {
                max = Math.max(count, max);
                count = 2;
            }
            i++;
            j++;
            k++;
        }
        max = Math.max(count, max);
        return max;
    }
}

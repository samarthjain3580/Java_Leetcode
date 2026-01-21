class Solution {
    public int longestSubsequence(int[] nums) {
        int count = nums.length;
        int curr = 0;
        for(int i=0; i<nums.length; i++) {
            curr = curr ^ (nums[i]);
        }

        boolean flag = false;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                flag = true;
                break;
            }
        }

        if (!flag) return 0;
        
        if (curr == 0) count--;
        return count;
    }
}

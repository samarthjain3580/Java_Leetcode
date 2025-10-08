class Solution {
    public int findDuplicate(int[] nums) {
        int idx = 0;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            idx = nums[i];
            if (arr[idx-1] == 0) {
                arr[idx-1] = idx;
            }
            else break;
        }
        return idx;
    }
}

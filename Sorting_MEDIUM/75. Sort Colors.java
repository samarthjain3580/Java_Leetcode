class Solution {
    public int[] sortColors(int[] nums) {
        for (int j=1; j<nums.length; j++) {
            for (int i=0; i<nums.length-1; i++) {
                if (nums[i] > nums[i+1]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        } 
        return nums;
    }
}

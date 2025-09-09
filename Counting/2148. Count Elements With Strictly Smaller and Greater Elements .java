class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] > min) {
                if(nums[i] < max) {
                    count++;
                }
            }
        }
        return count;
    }
}

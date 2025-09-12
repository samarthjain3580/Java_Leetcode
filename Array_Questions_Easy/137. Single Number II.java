class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        while(i<n-1) {
            if(nums[i] == nums[i+1]) {
                i+=3;
            }
            else {
                return nums[i];
            }
        }
        return nums[i];
    }
}

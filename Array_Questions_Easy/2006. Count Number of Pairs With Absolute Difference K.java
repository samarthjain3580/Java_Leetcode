class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=1; j<nums.length; j++) {
                if (i<j) {
                    if(Math.abs(nums[i] - nums[j]) == k) {
                        count++;
                    }
                }
            }
        }  
        return count;     
    }
}

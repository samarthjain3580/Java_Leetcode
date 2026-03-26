class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<k; i++) {
            if (nums[i] > nums[i+k]) sum+=nums[i];
        }

        for(int i=k; i<n-k; i++) {
            if (nums[i] > nums[i+k] && nums[i] > nums[i-k]) sum+=nums[i];
        }

        for(int i=n-k; i<n; i++) {
            if (nums[i] > nums[i-k]) sum+=nums[i];
        }
        
        return sum;
    }
}

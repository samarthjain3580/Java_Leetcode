class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        for(int i=0; i<k; i++) {
            sum+=nums[i];
        }
        double avg = sum/k;

        for(int i=k;i<n; i++) {
            sum+= nums[i] - nums[i-k];
            avg = Math.max(avg, sum/k);
        }
        return avg;

    }
}

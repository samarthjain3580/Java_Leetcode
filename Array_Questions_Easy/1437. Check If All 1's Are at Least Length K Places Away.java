class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int zero = k;
        for(int i=0; i<n; i++) {
            if (nums[i] == 1)  {
                if (zero >= k) zero = 0;
                else return false;
            }
            else zero++;
        } 
        return true;
    }
}

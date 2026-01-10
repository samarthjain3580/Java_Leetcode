class Solution {
    public long maxStrength(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        long ans = 1;
        int neg = 0, max_neg = Integer.MIN_VALUE , zero = 0;
        for(int num:nums) { 
            if (num == 0) {
                zero++;
                continue;
            }
            else if(num<0) {
                max_neg = Math.max(num, max_neg);
                neg++;
            }
            ans = ans * (long) num;
        }
        if (zero == n) return 0;
        if (neg%2 == 0) return ans;
        if (neg == 1 && zero == n-1 ) return 0;
        return ans/=max_neg;
    }
}

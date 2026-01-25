// brute force Method
// optimized version in Greedy Folder

class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0, a=0;

        if (nums[0] > k) return (long) k * (k + 1) / 2;

        for(int i=0; i<n; i++) {
            long diff = nums[i]-a-1;
            while (diff>0) {
                sum+=(a+1);
                a++;
                diff--;
                k--;
                if (k == 0) return sum;
            }
            
            a = nums[i];
        }
        
        long last = nums[n-1];
        while (k>0) {
            sum+=(last+1);
            last++;
            k--;
        }

        return sum;

    }
}

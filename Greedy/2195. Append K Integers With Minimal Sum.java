class Solution {
    public long minimalKSum(int[] nums, int count) {
        Arrays.sort(nums);
        long sum = 0;
        int i = 1, j = 0;

        while(j < nums.length) {
            if(i != nums[j]) {
                for(int k = i; k < nums[j]; k++) {
                    sum += k;
                    count--;
                    if(count == 0) return sum;
                }
            }
            i = nums[j]+1;
            j++;
        }

        if(count > 0) {
            long x = 2*(nums[nums.length-1]+1);
            x = (x + (count-1))*count;
            x = x/2;
            sum += x;
        }
        return sum;
    }
}

// Using Sorting
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int first = nums[0], last = nums[n-1]; 
        return GCD(first, last);
    }
    public int GCD(int a, int b) {
        while(a!=0) {
            int rem = b%a;
            b = a;
            a = rem;
        }
        return b;
    }
}

// Using Maths Only
class Solution {
    public int findGCD(int[] nums) {
        int first = nums[0], last = nums[nums.length-1]; 
        for(int i:nums) {
            first = Math.min(first, i);
            last = Math.max(last,i);
        }
        return GCD(first, last);
    }
    public int GCD(int a, int b) {
        while(a!=0) {
            int rem = b%a;
            b = a;
            a = rem;
        }
        return b;
    }
}

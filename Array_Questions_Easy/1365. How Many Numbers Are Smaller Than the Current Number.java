class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int idx = 0;
        while (n>idx) {
            int count  = 0;
            for(int i=0; i<n; i++) {
                if (nums[idx] > nums[i]) {
                    count++;
                }
            }
            arr[idx] = count;
            idx++;
        }  
        return arr;
    }
}

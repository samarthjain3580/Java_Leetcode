class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int n = nums.length;
        int i=0;
        int idx = 0;
        while(i<n-1) {
            if(nums[i] == nums[i+1]) {
                i+=2;
            }
            else {
                arr[idx] = nums[i];
                i++;
                idx++;
            }
        }
        if (idx <2) {
            arr[idx] = nums[i];
        } 
        return arr;
    }
}

class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.sort(nums); // 2,3,4,5

        for(int i=0; i<n; i+=2) {
            int temp = nums[i];
            arr[i] = nums[i+1];
            arr[i+1] = temp;
        }

        return arr;
    }
}

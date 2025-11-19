class Solution {
    public int dominantIndex(int[] nums) {
        int arr[] = nums.clone();
        int n = nums.length;
        Arrays.sort(arr);
        int max = arr[n-1];
        int max2 = arr[n-2];

        int idx = 0;
        for(int i=0; i<n; i++) {
            if (max == nums[i]) {
                idx = i;
                break;
            }
        }

        if (max2 == 0) return idx;

        return max/max2 >= 2 ? idx : -1; 
    }
}

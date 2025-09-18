class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    
    // Binary search for first occurrence
    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1; // shrink left side
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }

    // Binary search for last occurrence
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1; // shrink right side
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }
}

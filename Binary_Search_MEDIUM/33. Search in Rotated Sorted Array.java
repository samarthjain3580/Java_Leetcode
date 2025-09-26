class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1;
        int mid = (left+right)/2;
        if (nums[mid] > target) {
            left = mid+1;
        }
        else if (nums[mid] < target){
            right = mid-1;
        }

        return binarySearch(nums, left, right);  
    }

    public int binarySearch(int[] nums, int left, int right) {
        while (left < right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target ) {
                right = mid-1;
            }
        }
    }
}

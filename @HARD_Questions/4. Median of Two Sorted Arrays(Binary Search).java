class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int left = 0;
        int right = nums1.length;
        int total = nums1.length+nums2.length;
        int half = (total+1)/2;

        while(left<=right) {
            int mid1 = (left+right)/2;
            int mid2 = half-mid1;

            int nums1_left0 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1-1];
            int nums1_left = (mid1 == nums1.length) ? Integer.MAX_VALUE :  nums1[mid1]; 
            int nums2_left0 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2-1];
            int nums2_left = (mid2 == nums2.length) ? Integer.MAX_VALUE : nums2[mid2];
            
            if (nums1_left0 <= nums2_left && nums2_left0 <= nums1_left) {
                double ans;
                if (total % 2 == 0) { // even length
                    ans = (Math.max(nums1_left0, nums2_left0) + Math.min(nums1_left,nums2_left)) / 2.0;
                }
                else { // odd length
                    ans = Math.max(nums1_left0, nums2_left0);
                }
                return ans;
            }
            else if (nums2_left0 > nums1_left) {
                left = mid1+1;
            }
            else if (nums1_left0 > nums2_left) {
                right = mid1-1;
            }
        } 
        return 0;
    }
}

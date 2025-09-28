class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {  
        // for(int i=m; i<m+n; i++) {
        //     nums1[i] = nums2[i%n];
        // }
        // Arrays.sort(nums1);

        int[] arr = new int[m];
        for(int i=0; i<m; i++) {
            arr[i] = nums1[i];
        }

        int i = 0, j = 0, k = 0;

        while (i<m && j<n) {
            if (arr[i] <= nums2[j]) {
                nums1[k] = arr[i];
                i++;
            }
            else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums1[k] = arr[i];
            i++;
            k++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1 = nums1.length;
       int n2 = nums2.length; 
       int n = n1+n2;

       int[] arr = new int[n];

       int i = 0, j = 0, idx = 0;

       while(i<n1 && j<n2) {
        if (nums1[i] < nums2[j]) {
            arr[idx] = nums1[i];
            i++;
        }       
        else {
            arr[idx] = nums2[j];
            j++;
        }   
        idx++;
       }

       while (i<n1) {
        arr[idx] = nums1[i];
        i++;
        idx++;
       }

       while (j<n2) {
        arr[idx] = nums2[j];
        j++;
        idx++;
       }

       if (n % 2 == 0) {
        return (double) (arr[n/2]+arr[n/2 -1])/2;
       }

       return (double) arr[n/2];

    }
}

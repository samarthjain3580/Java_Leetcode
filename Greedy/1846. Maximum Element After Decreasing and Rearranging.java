class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); //[1,2,3,4,5,6,7,8];
        arr[0] = 1;

        for (int i=1; i<n; i++) {
            if (Math.abs(arr[i] - arr[i-1]) > 1) arr[i] = arr[i-1]+1; 
        }
        return arr[n-1];
    }
}

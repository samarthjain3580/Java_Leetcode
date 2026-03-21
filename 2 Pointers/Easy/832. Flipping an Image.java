class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image) reverse(arr);
        return image;
    }
    
    public void reverse(int[] arr) {
        int n = arr.length;
        int i=0, j=n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int idx=0; idx<n; idx++) {
            if (arr[idx] == 0) arr[idx] = 1;
            else arr[idx] = 0;
        }
    }
}

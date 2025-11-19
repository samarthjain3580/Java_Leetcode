class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        int i=0, j=1;
        while(i<n && j<n) {
            if (arr[i] == 2*arr[j] || arr[i]*2 == arr[j]) {
                return true;
            }
            j++;
            if (j == n) {
                i++;
                j = i+1;
            } 
        }
        return false;
    }
}

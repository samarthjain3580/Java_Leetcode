class Solution {
    public int[] sumZero(int n) {
        int[] arr_even = new int[n];
        int[] arr_odd = new int[n];
        arr_odd[0] = 0;

        for(int i=1; i<n; i+=2) {
            arr_even[i-1] = i;
            arr_even[i] = -i;
        }

        if (n%2 == 0) return arr_even;

        for(int i=1; i<n; i+=2) {
            arr_odd[i] = i;
            arr_odd[i+1] = -i;
        }
        return arr_odd;
    }
}

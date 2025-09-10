class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++) {
            int count = 0;
            int div = i;
            while(div>0) {
                int rem = div%2;
                div = div/2;
                if(rem == 1) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}

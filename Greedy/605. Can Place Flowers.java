class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int l = arr.length;
        for(int i=0; i<l && n>0; i++) {
            if (arr[i] == 0) {
                boolean left = (i == 0) || (arr[i - 1] == 0);
                boolean right = (i == l - 1) || (arr[i + 1] == 0);

                if (left && right) {
                    n--;
                    arr[i] = 1;         
                }
            }
        } 
        if (n == 0) return true;
        return false;
    }
}

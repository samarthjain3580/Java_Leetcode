class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;

        int two = 2, three = 3, five = 5;

        for (int i = 1; i < n; i++) {
            int next = Math.min(two, Math.min(three, five));
            arr[i] = next;

            if (next == two) two = arr[++i2] * 2;
            if (next == three) three = arr[++i3] * 3;
            if (next == five) five = arr[++i5] * 5;
        }

        return arr[n - 1];
    }
}

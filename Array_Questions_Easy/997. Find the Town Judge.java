class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];

        for (int[] arr : trust) {
            int a = arr[0], b = arr[1];
            arr2[a]++;
            arr1[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (arr1[i] == n - 1 && arr2[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

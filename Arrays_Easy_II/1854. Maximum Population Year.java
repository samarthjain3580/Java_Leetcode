class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] freq = new int[2051];
        for(int[] arr: logs) {
            freq[arr[0]]++;
            freq[arr[1]]--;
        }
        int max = 0, ans = 0, sum = 0;
        for(int i=1950; i<=2050; i++) {
            sum+=freq[i];
            if (sum > max) {
                sum = max;
                ans = i;
            }
        }

        return ans;
    }
}

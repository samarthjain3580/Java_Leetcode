class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];
        int max = 0;
        for(int i=1; i<=n; i++) {
            int temp = i;
            int group = 0;
            while (temp>0) {
                group+=(temp%10);
                temp/=10;
            }
            freq[group]++;
            max = Math.max(max, freq[group]);
        }

        int count = 0;
        for(int i=0; i<37; i++) {
            if (freq[i] == max) count++;
        }
        return count;
    }
}

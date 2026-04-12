class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] freq = new int[101];
        for(int num: nums) freq[num]++;

        for(int i=1; i<=100; i++) {
            for(int j=i+1; j<=100; j++) {
                if (freq[i] != freq[j] && freq[i] != 0 && freq[j] != 0) {
                    return new int[]{i,j};
                } 
            }
        }
        return new int[]{-1,-1};
    }
}

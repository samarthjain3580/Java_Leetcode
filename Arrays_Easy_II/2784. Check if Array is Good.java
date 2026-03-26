class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        if (n==1) return false;
        int[] freq = new int[201];
        for(int num: nums) freq[num]++;

        for(int i=1; i<n-1; i++) {
            if (freq[i] != 1) return false; 
        }

        if (freq[n-1] != 2) return false;
        return true;
    }
}

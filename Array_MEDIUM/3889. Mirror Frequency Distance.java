class Solution {
    public int mirrorFrequency(String s) {
        int[] freq_L = new int[26];
        int[] freq_D = new int[10];

        for(char ch: s.toCharArray()) {
            if (ch>='0' && ch<='9') freq_D[ch-'0']++;
            else freq_L[ch-'a']++;
        }

        int count = 0;
        for(int i=0; i<13; i++) {
            count+=(Math.abs(freq_L[i] - freq_L[25-i]));
        }

        for(int i=0; i<5; i++) {
            count+=(Math.abs(freq_D[i] - freq_D[9-i]));
        }

        return count;
    }
}

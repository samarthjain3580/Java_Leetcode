class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] freq1 = new int[26];
        for(char ch : word1.toCharArray()) {
            int index = ch-'a';
            freq1[index]++;
        }
        
        int[] freq2 = new int[26];
        for(char ch : word2.toCharArray()) {
            int index = ch-'a';
            freq2[index]++;
        }

        int unique_1 = 0;
        int unique_2 = 0;
        for(int i=0; i<26; i++) {
            if (freq1[i]>0) unique_1++;
            if (freq2[i]>0) unique_2++;
        }

        if (unique_1 == unique_2) {
            for (int i = 0; i < 26; i++) {
                if (freq1[i] > 0 && freq2[i] > 0) return true;
            }
        }


        for (int i=0; i<26; i++) {
            if (freq1[i] == 0) continue;
            for (int j=0; j<26; j++) {
                if (freq2[j] == 0) continue;
                if (i == j) continue;
                int temp1 = unique_1;
                int temp2 = unique_2;
                if (freq1[i] == 1) temp1--;
                if (freq1[j] == 0) temp1++;
                if (freq2[j] == 1) temp2--;
                if (freq2[i] == 0) temp2++;

                if (temp1 == temp2) return true;
            }
        }
        return false;
    }
}

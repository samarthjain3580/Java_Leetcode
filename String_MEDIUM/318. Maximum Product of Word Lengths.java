// worst case scenario TC: (n^2 * L)
class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int max = 0;
        for(int i=0; i<n; i++) {
            String a = words[i];
            int[] freq = new int[26];
            for(char ch: a.toCharArray()) freq[ch-'a']++;
            int j = i+1;
            while (j<n) {
                String b = words[j];
                if (isUniqueLetters(freq, b)) {
                    max = Math.max(max, a.length()*b.length());
                }
                j++;
            }
        }
        return max;
    }

    public boolean isUniqueLetters(int[] freq, String b) {
        for(char ch: b.toCharArray()) {
            if (freq[ch-'a'] > 0) return false;
        }
        return true;
    }
}

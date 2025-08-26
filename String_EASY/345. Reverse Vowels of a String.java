class Solution {
    static boolean[] vowels = new boolean[128];
    static {
        for (char c : new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' }) {
            vowels[c] = true;
        }
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!vowels[chars[i]]) { i++; continue; }
            if (!vowels[chars[j]]) { j--; continue; }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++; j--;
        }
        return new String(chars);
    }
    static {
        for (int i = 0; i < 150; i++) reverseVowels("tato");
    }
}

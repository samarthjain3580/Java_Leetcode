class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = new char[26];

        for (char ch : s.toCharArray()) {
            charArray[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            charArray[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charArray[i] > 0) return false;
        }

        return true;
    }
}

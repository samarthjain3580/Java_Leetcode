class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++) {
            char first = s.charAt(i);
            if (s.indexOf(first)==(s.lastIndexOf(first))) {
                return i;
            }
         }
        return -1;
    }
}

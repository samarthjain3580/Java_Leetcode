class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int r = 0, l = 0;
        for(char ch: s.toCharArray()) {
            if (ch == 'R') r++;
            else l++;
            if (l==r) count++;
        }
        return count;
    }
}

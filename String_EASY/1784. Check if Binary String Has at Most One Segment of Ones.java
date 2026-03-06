class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = true;
        for(char ch: s.toCharArray()) {
            if (ch=='1' && flag) flag = true;
            else if (ch == '1' && !flag) return false;
            else flag = false;
        }
        return true;
    }
}

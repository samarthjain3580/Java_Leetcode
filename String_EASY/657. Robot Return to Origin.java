class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0; // axis
        for (char ch: moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'L') x--;
            else if (ch == 'D') y--;
            else x++;
        }
        return (x == 0 && y == 0) ? true:false;
    }
}

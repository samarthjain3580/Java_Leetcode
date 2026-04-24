class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int lc = 0, rc = 0, blank = 0;
        for (char ch: moves.toCharArray()) {
            if (ch == 'L') lc++;
            else if (ch == 'R') rc++;
            else blank++;
        }
        if (lc == rc) return blank;
        if (blank == n) return n;

        if (lc > rc) lc+=blank;
        else if (rc > lc) rc+=blank;
        
        return Math.abs(lc-rc);
    }
}

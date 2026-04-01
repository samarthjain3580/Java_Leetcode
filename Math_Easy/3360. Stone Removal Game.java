class Solution {
    public boolean canAliceWin(int n) {
        if (n<10) return false;
        int stone = 10;
        while(n>0) {
            //Alice
            if (n-stone >= 0) {
                n-=stone;
                stone--;
            }
            else return false;

            //Bob
            if(n-stone >= 0) {
                n-=stone;
                stone--;
            }
            else return true;
        }
        return false;
    }
}

class Solution {
    public boolean divisorGame(int n) {
        int count = 0;
        int x = 1;
        while (n>x) {
            if (n%x == 0) {
                n = n-x;
                x=1;
                count++;
            }
            else {
                x++;
            }
        }
        return count % 2 != 0;
        
    }
}

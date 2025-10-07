class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        int[] diff = new int[c.length];
        for(int i=0; i<c.length; i++) {
            diff[i] = c[i]-r[i];
        }
        Arrays.sort(diff);
        int count = 0;
        for(int i=0; i<diff.length; i++) {
            if (diff[i] == 0) count++;
            else if (a>=diff[i]) {
                a-=diff[i];
                count++;
            }
            else break;
        }
        return count;
    }
}

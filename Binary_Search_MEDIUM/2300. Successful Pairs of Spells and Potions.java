class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] pair = new int[spells.length];
        for(int i=0; i<spells.length; i++) {
            int count=0, left=0, right=potions.length-1;
            while(left<=right) {
                int mid = (left+right)/2;
                if ((long) spells[i] * potions[mid] >= success) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            pair[i] = potions.length-left;
        }
        return pair;
    }
}

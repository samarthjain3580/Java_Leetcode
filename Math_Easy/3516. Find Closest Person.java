class Solution {
    public int findClosest(int x, int y, int z) {
        int person_1 = Math.abs(z-x);
        int person_2 = Math.abs(z-y);
        if(person_1 < person_2) return 1;
        else if(person_2 < person_1) return 2;
        return 0;

    }
}

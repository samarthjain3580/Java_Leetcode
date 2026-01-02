class Solution {
    public int countOdds(int low, int high) {
        int diff = high-low;
        if (low%2 != 0 && high%2 != 0) return (diff/2)+1;
        else if (low%2 == 0 && high%2 == 0) return diff/2;
        else return (diff+1)/2;
        }
    }
}

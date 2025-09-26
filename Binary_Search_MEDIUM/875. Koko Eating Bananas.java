class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum=Math.max(sum, piles[i]);
        }
        int left = 1, right = sum;
        while (left < right) {
            int mid = (left+right)/2;
            if (isPossible(mid, piles, h)) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }

    public boolean isPossible(int mid, int[] arr, int h) {
        int time = 0;
        for(int i=0; i<arr.length; i++) {
            int pile = arr[i];
            time += (pile+mid-1)/mid;
            if (time > h) return false;
        }
        return true;
    }
}

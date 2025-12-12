class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            max = Math.max(max, candies[i]);
        }

        for(int i: candies) {
            if (i+extraCandies >= max) list.add(true);
            else list.add(false);
        }

        return list;

    }
}

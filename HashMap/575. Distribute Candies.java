class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int eat_candy = n/2;

        Set<Integer> set = new HashSet<>();
        for(int i : candyType) {
            set.add(i);
        }
        if (set.size() >= eat_candy) return eat_candy;
        else return set.size();
    }
}

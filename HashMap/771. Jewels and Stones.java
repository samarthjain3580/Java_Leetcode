class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map_j = new HashMap<>();
        for(char c: jewels.toCharArray()) {
            map_j.put(c, map_j.getOrDefault(c,0)+1);
        }

        Map<Character, Integer> map_s = new HashMap<>();
        for(char c: stones.toCharArray()) {
            map_s.put(c, map_s.getOrDefault(c,0)+1);
        }
        
        int count = 0;

        for(char c: map_j.keySet()) {
            int a = map_s.getOrDefault(c,0);
            int b = map_j.get(c);

            count += a/b;
        } 
        return count;
    }
}

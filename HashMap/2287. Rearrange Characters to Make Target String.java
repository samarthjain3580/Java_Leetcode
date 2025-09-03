class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> map_s = new HashMap<>();
        for (char c : s.toCharArray()) {
            map_s.put(c, map_s.getOrDefault(c, 0) + 1);
        } 

        Map<Character, Integer> map_t = new HashMap<>();
        for (char c : target.toCharArray()) {
            map_t.put(c, map_t.getOrDefault(c, 0) + 1);
        } 


        int min = 100;

        for (char c : map_t.keySet()) {
            int available = map_s.getOrDefault(c, 0);
            int required = map_t.get(c);
            min = Math.min(min, available / required);
        }       
        System.out.println(map_s);
        System.out.println(map_t);
        return min;
    }
}

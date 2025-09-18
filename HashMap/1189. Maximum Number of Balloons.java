class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map_text = new HashMap<>();
        for(char c: text.toCharArray()) {
            map_text.put(c, map_text.getOrDefault(c,0)+1);
        }

        String s = "balloon";

        Map<Character, Integer> map_balloon = new HashMap<>();
        for(char i: s.toCharArray()) {
            map_balloon.put(i, map_balloon.getOrDefault(i,0) +1);
        }

        int min = 100000;

        for (char c : map_balloon.keySet()) {
            int available = map_text.getOrDefault(c, 0);
            int required = map_balloon.get(c);
            min = Math.min(min, available / required);
        }

        // System.out.println(map_text);
        // System.out.println(map_balloon);

        return min;
    }
}

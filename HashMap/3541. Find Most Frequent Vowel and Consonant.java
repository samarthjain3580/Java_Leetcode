class Solution {
    public int maxFreqSum(String s) {
        String vowel = "";
        String cons = "";
        String c = "aeiou";
        for(int i=0; i<s.length(); i++) {
            if(c.contains(s.substring(i,i+1))) {
                vowel+=s.charAt(i);
            }
            else {
                cons+=s.charAt(i);
            }
        }

        Map<Character, Integer> map_v = new HashMap<>();
        for(char ch: vowel.toCharArray()) {
            map_v.put(ch, map_v.getOrDefault(ch,0)+1);
        }

        int max_vowel = 0;
        if (!map_v.isEmpty()) {
            max_vowel = Collections.max(map_v.values());
        }

        Map<Character, Integer> map_c = new HashMap<>();
        for(char ch: cons.toCharArray()) {
            map_c.put(ch, map_c.getOrDefault(ch,0)+1);
        }

        int max_cons = 0;
        if (!map_c.isEmpty()) {
            max_cons = Collections.max(map_c.values());
        }

        return max_cons + max_vowel;
    }
}

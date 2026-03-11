class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int total = 0;
        int max = 0;
        
        for(char key: map.keySet()) {
            int val = map.get(key);
            if (val % 2 == 0) total+=val;
            else max = Math.max(max, val);
        }

        for(char key: map.keySet()) {
            int val = map.get(key);
            if (val%2 !=0 ) {
                total+=(val-1);
            }
        }

        if (max == 0) return total;
        return total+1;
    }

    // u:3, i:3, e:4, w:3, r:2, o:1, h:2, f:2;
}

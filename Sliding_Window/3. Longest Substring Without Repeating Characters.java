class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(char ch: s.toCharArray()) {
            while (set.contains(ch)) {
                max = Math.max(max, set.size());
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
        }
        return Math.max(max, set.size());
    }
}

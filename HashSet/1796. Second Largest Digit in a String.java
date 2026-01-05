class Solution {
    public int secondHighest(String s) {
        TreeSet<Character> set = new TreeSet<>();
        for(char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) set.add(ch);
        }  
        if (set.size() > 1) return set.lower(set.last())-'0';
        return -1;
    }
}

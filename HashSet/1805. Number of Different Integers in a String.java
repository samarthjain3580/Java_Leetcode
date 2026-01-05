class Solution {
    public int numDifferentIntegers(String word) {
        for(char ch: word.toCharArray()) {
            if (!Character.isDigit(ch)) {
                word = word.replace(ch, ' ');
            }
        }
        String arr[] = word.trim().split("\\s+");
        
        Set<String> set = new HashSet<>();
        for(String s: arr) {
            if (s.isEmpty()) continue;

            s = s.replaceFirst("^0+","");
            if (s.isEmpty()) s="0";

            set.add(s);
        }
        return set.size();
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();
        for(String s: words) {
            String ans = "";
            for(char ch: s.toCharArray()) {
                ans += arr[ch-'a'];
            }
            set.add(ans);
        }

        return set.size();
        
    }
}

class Solution {
    public int possibleStringCount(String word) {
        int ans = 1, curr = 1;
        for(int i=0; i<word.length()-1; i++) {
            if (word.charAt(i) == word.charAt(i+1)) {
                curr++;
            }
            else {
                ans = 1;
            }
        }
        return curr;
    }
}

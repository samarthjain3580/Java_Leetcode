class Solution {
    public char findTheDifference(String s, String t) {
        char result=0;
        for(char c:s.toCharArray()){
            result^=c;
        }
        for(char ch:t.toCharArray()){
            result^=ch;
        }
        return result;
    }
}

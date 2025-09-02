class Solution {
    public char findTheDifference(String s, String t) {
        int ans = 0;
        char[] ch = s.toCharArray();
        char[] cha = t.toCharArray();
        for(char i : cha){
            ans = ans + i;
        }
        for(char j : ch){
            ans = ans - j;
        }

        return (char)ans;
    }
}

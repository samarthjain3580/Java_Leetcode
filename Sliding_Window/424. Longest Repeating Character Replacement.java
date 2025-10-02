class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int window = 0;
        int ans = 0;
        for(int right = 0; right<s.length(); right++) {
            count[s.charAt(right)-'A']++; 
            window = Math.max(window, count[s.charAt(right) - 'A']);
            while (k < right-left+1-window) {
                count[s.charAt(left)-'A']--; 
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }   
        return ans;
    }
}

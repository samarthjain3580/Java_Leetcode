class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 0;
        for(int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            }
            else {
                max = Math.max(count, max);
                count = 1;
            }
        }  
        max = Math.max(count, max); 
        return max;
    }
}

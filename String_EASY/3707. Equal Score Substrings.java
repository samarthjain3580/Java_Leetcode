class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(n-1>0) {
            int left = 0;
            for(int i=0; i<s.length()-end+start; i++) {
                left += (int)s.charAt(i)-96;
            }
            // System.out.println(left);

            int right = 0;
            for(int j=s.length()-end+start; j<s.length(); j++) {
                right += (int)s.charAt(j)-96;
            }
            // System.out.println(right);

            if (right == left) return true;

            start++;
            n--;
        }
        return false;
    }
}

class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int left_mark = 0, right_mark = 0;
        int left_sum = 0, right_sum = 0;
        for(int i=0; i<n/2; i++) {
            if (num.charAt(i) == '?') left_mark++;
            else left_sum+=(num.charAt(i)-'0');
        }

        for(int i=n/2; i<n; i++) {
            if (num.charAt(i) == '?') right_mark++;
            else right_sum+=(num.charAt(i)-'0');
        }

        int diff = left_sum - right_sum;
        int diff_mark = left_mark - right_mark;
        
        if ((diff + diff_mark * 9 / 2) != 0 || (diff_mark % 2 != 0)) {
            return true;
        }
        
        return false;
    }
}

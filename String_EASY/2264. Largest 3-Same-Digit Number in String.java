class Solution {
    public String largestGoodInteger(String num) {
        int var = 0;
        boolean flag = false;
        for(int i=0; i<num.length()-2; i++) {
            if (num.charAt(i) == num.charAt(i+1)) {
                if (num.charAt(i+1) == num.charAt(i+2)) {
                    var = Math.max(var, num.charAt(i)-'0');
                    flag = true;
                }
            }
        }
        if (!flag) return "";
        else return ""+var+var+var;
    }
}

class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int n = s.length();
        int left = 0, right = 1;
        while (right <=n) {
            String temp = s.substring(left, right);
            if (temp.length() == k) {
                set.add(temp);
                left++;
            }
            right++;
        } 
        int total = (int) Math.pow(2,k);
        return set.size() == total ? true:false;
    }
}

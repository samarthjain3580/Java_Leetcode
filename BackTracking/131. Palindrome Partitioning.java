class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        partition(s, ans, list);
        return ans;

    }

    public void partition(String s, List<List<String>> ans, List<String> list) {

        if (s.length() == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=1; i<=s.length(); i++) {
            String str = s.substring(0,i);
            if (isPalindrome(str)) {
                list.add(str);
                partition(s.substring(i), ans, list);
                list.remove(list.size()-1);
            }

        }
    }

    public boolean isPalindrome(String str) {
        int i=0; 
        int j = str.length()-1;
        while(i<=j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

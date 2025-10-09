class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++) {
            ans+=reverse(" "+arr[i]);
        }
        return ans.trim();
    }

    public String reverse(String str) {
        String ans = "";
        int j = str.length()-1;
        while(j>=0) {
            ans = ans+str.charAt(j);
            j--;
        }
        return ans;
    }
}

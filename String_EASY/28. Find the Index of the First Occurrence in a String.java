class Solution {
    public int strStr(String haystack, String needle) {
        int ans=-1;
        int l=needle.length();
        for(int i=0;i<=haystack.length()-l;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+l).equals(needle)){
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }
}

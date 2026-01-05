class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int c=0;
        for(String str: words) {
            String reverse = ""+str.charAt(1)+str.charAt(0);

            if (set.contains(reverse)) c++;
            else set.add(str); 
        }
        return c;
    }
}

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list = new ArrayList<>();
        int n = groups.length;
        int i=0, j=1;
        list.add(words[0]);
        while(j<n) {
            if(groups[i] != groups[j]) {
                list.add(words[j]);
                i=j;
            } 
            j++;
            
        }
        return list;
    }
}

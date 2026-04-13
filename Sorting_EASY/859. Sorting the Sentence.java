class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;

        String[] freq = new String[n+1];

        for(String str: arr) {
            int l = str.length()-1;
            int num = str.charAt(l)-'0';
            freq[num] = str.substring(0,l);
        } 
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n; i++) {
            sb.append(freq[i]);
            sb.append(" ");
        }
        sb.append(freq[n]);

        return sb.toString();
    }
}

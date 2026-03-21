class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int first = 0, second = n;
        int[] arr = new int[n+1];
        
        int idx = 0;
        for(char ch: s.toCharArray()) {
            if (ch == 'I') {
                arr[idx++] = first;
                first++;
            }
            else {
                arr[idx++] = second;
                second--;
            }
        }
        arr[n] = first;
        return arr;
    }
}

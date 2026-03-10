class Solution {
    public int countAsterisks(String s) {
        int asterisks = 0;
        String[] arr = s.split("\\|");

        for(int i=0; i<arr.length; i+=2) {
            String str = arr[i];
            for(char ch: str.toCharArray()) {
                if (ch == '*') asterisks++;
            }
        }
        return asterisks;
    }
}

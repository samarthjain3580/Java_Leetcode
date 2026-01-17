class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int a = word1.length(), b = word2.length();

        int i=0, j=0;
        while(i<a && j<b) {
            char ch1 = word1.charAt(i) , ch2 = word2.charAt(j);

            if (ch1 == ch2) {
                if (word1.substring(i).compareTo(word2.substring(j)) > 0) {
                    sb.append(ch1);
                    i++;
                }
                else {
                    sb.append(ch2);
                    j++;
                }
            }
            
            else if (ch1 > ch2) {
                sb.append(ch1);
                i++;
            }

            else if (ch1 < ch2) {
                sb.append(ch2);
                j++;
            }
        }

        while (i<a) {
            sb.append(word1.charAt(i));
            i++;
        }

        while (j<b) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}

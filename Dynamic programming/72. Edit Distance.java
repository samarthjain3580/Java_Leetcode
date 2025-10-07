class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        return distance(word1, word2, 0, 0, dp);
    }

    public int distance(String word1, String word2, int i, int j, int[][] dp) {
        int ans = 0;

        if (i==word1.length()){
            return word2.length()-j;
        }

        if (j==word2.length()){
            return word1.length()-i;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }        

        if (word1.charAt(i) == word2.charAt(j)) {
            return distance(word1, word2, i+1, j+1, dp);
        }
        else {
            int I = distance(word1, word2, i, j+1, dp);
            int D = distance(word1, word2, i+1, j, dp);
            int R = distance(word1, word2, i+1, j+1, dp);

            ans = Math.min(I, Math.min(D,R))+1;
        }
        return dp[i][j] = ans;
    }
}

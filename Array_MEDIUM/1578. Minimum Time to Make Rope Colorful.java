class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0, n = colors.length()-1;
        int i = 1;
        while (n-->0) {
            if (colors.charAt(i) == colors.charAt(i-1)) {
                ans+=Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
            i++;
        }
        return ans;
    }
}

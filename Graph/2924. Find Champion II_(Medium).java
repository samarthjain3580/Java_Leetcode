class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] inDegree = new int[n];

        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            inDegree[v]++;
        }

        int ans = -1;
        for(int i=0; i<n; i++) {
            if (ans!=-1 && inDegree[i] == 0) return -1;
            else if (inDegree[i] == 0) ans=i;
        }
        return ans;
    }
}

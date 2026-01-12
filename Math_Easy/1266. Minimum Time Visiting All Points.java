class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        for(int i=0; i<points.length-1; i++) {
            int x_diff = Math.abs(points[i][0]-points[i+1][0]);
            int y_diff = Math.abs(points[i][1]-points[i+1][1]);

            distance += Math.max(x_diff, y_diff);
        }
        return distance;
    }
}

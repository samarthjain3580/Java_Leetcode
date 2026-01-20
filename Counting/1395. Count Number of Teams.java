class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        
        for(int j=1; j<n-1; j++) {
            int ls = 0, rs = 0, lg = 0, rg = 0;     //ls : left smaller, rg: right greater 

            for(int i=0; i<j; i++) {
                if (rating[i]<rating[j]) ls++;
                else if (rating[i]>rating[j]) lg++;
            }

            for(int k=j+1; k<n; k++) {
                if (rating[j]<rating[k]) rg++;
                else if (rating[j]>rating[k]) rs++;
            }

            count+= ls*rg;
            count+= rs*lg;
        }
        return count;
    }
}

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int idx = 0;
        int var = 1;

        while(candies > 0) {
            if (candies >= var) {
                arr[idx] += var;
                candies -=var;
            }
            else {
                arr[idx] += candies;
                break;
            }

            idx = (idx+1) % num_people;
            var++;
        }  
        return arr;
    }
}

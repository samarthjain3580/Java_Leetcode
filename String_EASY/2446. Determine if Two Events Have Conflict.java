class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        for (int i = 0; i < 5; i++) {
            if (event1[0].compareTo(event2[1]) > 0) {
                return false;
            }

            if (event2[0].compareTo(event1[1]) > 0) {
                return false;
            }

            return true;
        }

        return false; 
    }
}

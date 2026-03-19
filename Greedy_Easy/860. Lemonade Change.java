class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for(int i=0; i<bills.length; i++) {
            if (bills[i] == 5) five++;
            else if (bills[i] == 10) {
                ten++;
                five--;
            }
            else {
                if (ten == 0) five-=3;
                else {
                    ten--;
                    five--;
                }
                twenty++;
            }
            if (five<0) return false;
        }
        return true;
    }
}

OR 

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int bill: bills) {
            if (bill == 5) five++;
            else if (bill == 10) {
                ten++;
                if (five>=1) five--;
                else return false;
            }
            else {
                if (ten>=1 && five>=1) {
                    ten--;
                    five--;
                }
                else if (five >=3) five-=3;
                else return false;
            }
        }

        return true;
    }
}

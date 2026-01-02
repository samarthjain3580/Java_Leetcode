class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if (isSelf(i)) list.add(i);
        }
        return list;
    }

    public boolean isSelf(int n) {
        int temp = n;
        while(temp>0) {
            int digit = temp%10;
            if (digit == 0 || n%digit != 0) return false;
            temp=temp/10;
        }
        return true;
    }
}

class Solution {
    public List<Integer> findGoodIntegers(int n) {
        // (1,1),(1,2),(1,3),(1,4),(2,2),(2,3),(2,4),(3,3),(3,4)
        // 1,9,28,65,16,36,72,54,91
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int a=1; a<=1000; a++) {
            for(int b=a+1; b<=1000; b++) {
                int x = ((int) Math.pow(a,3) + (int) Math.pow(b,3));
                if (x<=n) {
                    if (set.contains(x)){
                        if(!list.contains(x)){
                            list.add(x);
                        }
                    }
                    set.add(x);
                }
                else break;
            }

        }

        Collections.sort(list);
        return list;
    }
}

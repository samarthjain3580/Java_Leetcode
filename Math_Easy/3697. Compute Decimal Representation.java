class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        String s = Integer.toString(n);
        int l = s.length()-1;
        for(int i=0; i<s.length(); i++) {
            int val = (s.charAt(i) - '0') * (int) Math.pow(10,l-i);
            if (val != 0) {
                list.add(val);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(list);
        return arr;
    }
}

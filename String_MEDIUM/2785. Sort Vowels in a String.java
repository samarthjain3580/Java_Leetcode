class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();
        for(char ch: s.toCharArray()) {
            if (vowels.contains(ch+"")) list.add(ch);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(char ch: s.toCharArray()) {
            if (vowels.contains(ch+"")) {
                sb.append(list.get(idx));
                idx++;
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}

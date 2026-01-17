class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        // for(int i=0; i<s.length(); i++) {
        //     if (s.charAt(i) == '6') {
        //         s = s.replaceFirst(s.charAt(i)+"", "9");
        //         break;
        //     }
        // }

        for(int i=0; i<ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }
        }

        // System.out.println(ch);

        return Integer.valueOf(new String(ch));
    }
}

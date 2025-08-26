class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            if(s.charAt(n)!=' '){
                break;
            }
            n--;
        }
        int count=0;
        for(int i=n;i>=0;i--){
            if(s.charAt(n)==' '){
                break;
            }
            n--;
            count++;
        }
        return count;
    }
}

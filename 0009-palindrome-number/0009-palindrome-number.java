class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        String sb  = new StringBuilder(String.valueOf(x)).toString();
        String rev  = new StringBuilder(String.valueOf(x)).reverse().toString();

        if(sb.equals(rev)) return true;

        return false;
    }
}
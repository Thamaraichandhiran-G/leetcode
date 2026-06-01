class Solution {
    public boolean isSubsequence(String s, String t) {

        int a=0;

        for(int i=0;i<t.length() && a<s.length();i++){
            if(s.charAt(a)==t.charAt(i)){
                a++;
            }
        }
        return a==s.length();
    }
}
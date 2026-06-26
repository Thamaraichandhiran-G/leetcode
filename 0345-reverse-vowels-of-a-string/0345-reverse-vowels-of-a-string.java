class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int i=0,j=s.length()-1;

        String v  = "aeiouAEIOU";

        while(i<j){
            while(v.indexOf(s.charAt(i))==-1 && i<j){
                i++;
            }
            while(v.indexOf(s.charAt(j))==-1 && i<j){
                j--;
            }
            char c = s.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,c);
            i++;
            j--;
        }

        return sb.toString();
    }
}
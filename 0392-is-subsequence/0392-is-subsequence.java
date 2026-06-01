class Solution {
    public boolean isSubsequence(String s, String t) {
        
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        int a=0;

        for(int i=0;i<tc.length && a<sc.length;i++){
            if(sc[a]==tc[i]){
                a++;
            }
        }
        return a==sc.length;
    }
}
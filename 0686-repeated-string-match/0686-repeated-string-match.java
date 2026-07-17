class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s=a;
        int c=1;
            
        while(s.length()<b.length()+a.length()){
            if(s.contains(b)){
                return c;
            }
            s+=a;
            c++;
        }
        if(s.contains(b)){
            return c;
        }
       return -1;
    }
}
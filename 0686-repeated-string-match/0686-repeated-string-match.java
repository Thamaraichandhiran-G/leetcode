class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        StringBuilder sb = new StringBuilder(a);
        int c=1;

        while(sb.length()<b.length()){
            
            if(sb.indexOf(b)!=-1){
                return c;
            }
            sb.append(a);
            c++;
        }
        if(sb.indexOf(b)!=-1){
                return c;
        }
        sb.append(a);
        c++;
        if(sb.indexOf(b)!=-1){
                return c;
        }
        return -1;
    }
}
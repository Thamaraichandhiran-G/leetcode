class Solution {
    public int compress(char[] chars) {
        StringBuilder  sb = new StringBuilder();
        int c=1;
        int n = chars.length;
        if(n==1){
            return 1;
        }
        for(int i=0;i<n;i+=c){
            c=1;
            while((i+c)<=n-1){
                if(chars[i+c]==chars[i]){
                    c++;
                }else{
                    break;
                }
            }
            sb.append(chars[i]);
            if(c!=1){
                sb.append(c);
            }
           
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        System.out.println(sb.length());
        return sb.length();
        
    }
}
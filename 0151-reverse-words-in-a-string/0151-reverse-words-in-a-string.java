class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();

        String str[]= s.split("\\s+");

        int n = str.length;

        StringBuilder sb = new StringBuilder();

        for(int i=n-1;i>=0;i--){
            sb.append(str[i].trim());
            if(i!=0){
                sb.append(" ");
            }
            
        }
        return sb.toString();
    }
}
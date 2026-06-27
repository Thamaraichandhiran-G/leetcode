class Solution {
    public String largestEven(String s) {
        // return s.substring(0,s.lastIndexOf('2')+1);
        int i =s.length()-1;
        while(i>=0){
            if("02468".indexOf(s.charAt(i))!=-1){
                return s.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st1 = new Stack<>();

        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                st1.push(c);
            }else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        Stack<Character> st2 = new Stack<>();
        for(char c:t.toCharArray()){
            if(Character.isLetter(c)){
                st2.push(c);
            }else{
                 if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        return st1.equals(st2);
    }
}
class Solution {
    public int countAsterisks(String s) {
        
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='|'){
                if(st.search('|')!=-1){
                    while(st.peek()!='|'){
                        st.pop();
                    }
                    st.pop();
                }else{
                    st.push(c);
                }
            }else{
                st.push(c);
            }
        }
        int c=0;
        while(!st.isEmpty()){
            if(st.pop()=='*'){
                c++;
            }
        }
        return c;
    }
}
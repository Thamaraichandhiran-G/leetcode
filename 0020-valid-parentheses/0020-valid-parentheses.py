class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        op = '{(['
        for a in s:
            if a in op:
                st.append(a)
            else:
                if len(st)==0:
                    return False
                match(a):
                    case ')':
                        if st.pop()!='(':
                            return False
                    case '}':
                        if st.pop()!='{':
                            return False
                    case ']':
                        if st.pop()!='[':
                            return False
        if(not st):
            return True
        else:
            return False


                    
        
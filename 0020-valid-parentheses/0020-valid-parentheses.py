class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        pairs = { ')':'(','}':'{',']':'['}

        for a in s:
            if a in '({[':
                st.append(a)
            else:
                if not st or  pairs[a] != st.pop():
                    return False
        return not st    
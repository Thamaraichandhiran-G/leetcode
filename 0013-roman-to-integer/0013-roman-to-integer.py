def value(c : str) -> int:
        if c =='I':
            return 1
        elif c == 'V':
            return 5
        elif c=='X':
            return 10
        elif c == 'L':
            return 50
        elif c == 'C':
            return 100
        elif c == 'D':
            return 500
        elif c == 'M':
            return 1000

class Solution:
    def romanToInt(self, s: str) -> int:
        tot = 0
        prev = 0

        for i in reversed(s):
            curr = value(i)
            if curr < prev:
                tot -= curr
            else:
                tot += curr
            prev = curr

        return tot

        
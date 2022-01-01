class Solution:
    def isPalindrome(self, x: int) -> bool:
        if str(x)[0]=='-':
            return False
        return x==int(str(x)[::-1])
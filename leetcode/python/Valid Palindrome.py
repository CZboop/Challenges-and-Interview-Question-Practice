class Solution:
    def isPalindrome(self, s: str) -> bool:
        s_alpha = [i.lower() for i in s if i.isalnum()]
        return s_alpha==s_alpha[::-1]
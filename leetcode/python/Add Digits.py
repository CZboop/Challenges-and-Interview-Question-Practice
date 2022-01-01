class Solution:
    def addDigits(self, num: int) -> int:
        num = str(num)
        while len(num)>1:
            num = sum([int(i) for i in num])
            num = str(num)
        return int(num)
import re
def solve(s):
    x = re.split("[aeiou]",s)
    new = []
    for i in x:
        n = 0
        for j in i:
            n+=(ord(j)-96)
        new.append(n)
    return max(new)
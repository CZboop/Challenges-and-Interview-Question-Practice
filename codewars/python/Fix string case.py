def solve(s):
    x = [i for i in s if i.isupper()]
    y = [i for i in s if i.islower()]
    return s.upper() if len(x)>len(y) else s.lower()
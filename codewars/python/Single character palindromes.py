def solve(s):
    if s==s[::-1]:
        return "OK"
    else:
        x = [s[:c]+s[c+1:] for c,v in enumerate(s)]
        if any(i==i[::-1] for i in x):
            return "remove one"
        return "not possible"
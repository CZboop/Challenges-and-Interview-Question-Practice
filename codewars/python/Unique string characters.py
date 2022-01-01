def solve(a,b):
    new=""
    for i in a:
        if i not in b:
            new+=i
    for i in b:
        if i not in a:
            new+=i
    return new
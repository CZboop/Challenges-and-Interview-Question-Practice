import itertools
def accum(s):
    l = []
    new = ""
    for count, val in enumerate(s):
        for j in range(count+1):
            if j==0:
                l.append(val.upper())
            else:
                l.append(val.lower())
        l.append("-")
    l = "".join(l)
    l = l.strip("-")
    return l
def longest(s1, s2):
    new = []
    for i in s1:
        if i not in new:
            new.append(i)
    for j in s2:
        if j not in new:
            new.append(j)
    new.sort()
    ns = "".join(new)
    return ns
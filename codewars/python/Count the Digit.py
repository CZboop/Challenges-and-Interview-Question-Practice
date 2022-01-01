def nb_dig(n, d):
    l = []
    for i in range(0, n+1):
        l.append(i**2)
    l = "".join(str(l))
    return l.count(str(d))
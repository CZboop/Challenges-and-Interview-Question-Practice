def mineLocation(field):
    new = []
    for c,v in enumerate(field):
        if 1 in v:
            new.append(c)
        for n,j in enumerate(v):
            if j==1:
                new.append(n)
    return new
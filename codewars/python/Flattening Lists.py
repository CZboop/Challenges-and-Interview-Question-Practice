def flatten(l):
    x = []
    for i in l:
        for j in i:
            x.append(j)
    return x
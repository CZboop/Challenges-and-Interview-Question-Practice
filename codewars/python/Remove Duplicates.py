def unique(integers):
    x = []
    for i in integers:
        if i not in x:
            x.append(i)
    return x
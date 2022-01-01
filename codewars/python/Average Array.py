def avg_array(arrs):
    new = []
    for i in arrs:
        for c,v in enumerate(i):
            if len(new)<len(i):
                new.append(v)
            else:
                new[c]+=v
    for c,v in enumerate(new):
        new[c] = v/len(arrs)
    return new
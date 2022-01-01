def unique_in_order(it):
    if len(it)==0:
        return []
    new=[]
    for c,v in enumerate(it[:-1]):
        if v!=it[c+1]:
            new.append(v)
    try:
        if it[-1]!=new[-1]:
            new.append(it[-1])
    except:
            new.append(it[0])
    return new
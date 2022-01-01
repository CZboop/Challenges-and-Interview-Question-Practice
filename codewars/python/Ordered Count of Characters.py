def ordered_count(inp):
    x=[]
    for i in inp:
        if (i,inp.count(i)) not in x:
            x.append((i,inp.count(i)))
    return x
def filter_list(l):
    x=[]
    for i in l:
        if isinstance(i,int):
            x.append(i)
    return x
def pluck(objs, name): 
    new = []
    for i in objs:
        new.append(i.get(name))
    return new
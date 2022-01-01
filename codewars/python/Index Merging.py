def index_merge(a, b):
    new = []
    for c,v in enumerate(a):
        for i,j in enumerate(b):
            if c==i:
                new.append(v+j)
    return new
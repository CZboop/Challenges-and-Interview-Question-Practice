def matrix(array): 
    new = []
    for c,i in enumerate(array):
        y = []
        for x,j in enumerate(i):
            if c==x:
                if j<0:
                    y.append(0)
                else:
                    y.append(1)
            else:
                y.append(j)
        new.append(y)
    return new
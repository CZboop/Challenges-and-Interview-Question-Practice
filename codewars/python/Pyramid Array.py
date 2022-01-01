def pyramid(n):
    x = []
    for i in range(n+1):
        y=[]
        for j in range(i):
            y.append(1)
        if len(y)>0:
            x.append(y) 
    return x
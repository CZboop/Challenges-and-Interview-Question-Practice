def squares(x, n):
    y=[]
    if n>0:
        for i in range(1,n+1):
            if len(y)<1:
                y.append(x)
            else:
                y.append(y[-1]**2)
    return y
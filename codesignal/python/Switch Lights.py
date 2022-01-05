def solution(a):
    for c,v in enumerate(a):
        if v==1:
            for i,j in enumerate(a[:c+1]):
                a[i] = not a[i]
    new = []
    for i in a:
        if i==False:
            new.append(0)
        else:
            new.append(1)
    return new

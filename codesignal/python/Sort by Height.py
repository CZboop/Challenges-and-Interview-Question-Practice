def solution(a):
    inds = [c for c,v in enumerate(a) if v==-1]
    x = sorted(i for i in a if i != -1)
    new = []
    for i in range(len(a)):
        if i in inds:
            new.append(-1)
        else:
            new.append(x[0])
            x.pop(0)
    return new 
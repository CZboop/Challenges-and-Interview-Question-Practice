def solution(a, q):
    inds = [[i for i in range(i[0],i[1]+1)] for i in q]
    inds = [i for j in inds for i in j]

    x = sorted([inds.count(i) for i in set(inds)], reverse=True)
    y = sorted(a, reverse=True)
    z = sum(i*j for i, j in zip(x,y))
    
    return z
    

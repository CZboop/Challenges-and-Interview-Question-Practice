def strange_math(n, k):
    n = sorted([str(i) for i in range(1,n+1)])
    return n.index(str(k))+1
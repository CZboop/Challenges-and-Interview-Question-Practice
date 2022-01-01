def find_smallest(n,t):
    x = min(n)
    if t=="value":
        return x
    elif t=="index":
        return n.index(x)
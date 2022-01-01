def magical_well(a, b, n):
    t = 0
    for i in range(n):
        t+=(a*b)
        a+=1
        b+=1
    return t
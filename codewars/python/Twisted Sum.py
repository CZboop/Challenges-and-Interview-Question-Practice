def compute_sum(n):
    x = 0
    for i in range(1,n+1):
        for j in str(i):
            x+=int(j)
    return x
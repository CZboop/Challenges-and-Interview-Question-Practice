def pillars(n, d, w):
    if n==1:
        return 0
    else:
        d=d*100
        return (n-1)*d+w*n-2*w
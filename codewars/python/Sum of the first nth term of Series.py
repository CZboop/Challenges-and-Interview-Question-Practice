def series_sum(n):
    x=0
    for i in range(1,n+1):
        x+=1/(1+3*(i-1))
    return "{:.2f}".format(x)
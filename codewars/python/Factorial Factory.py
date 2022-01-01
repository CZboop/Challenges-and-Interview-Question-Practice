def factorial(n):
    if n==0:
        return 1
    x = 1
    for i in range(1,n+1):
        x*=i
    return x if n>0 else None
def factorial(n):
    print(n)
    if n<0 or n>12:
        raise ValueError
    else:
        x = 1
        for i in range(1,n+1):
            x*=i
        return x
def dig_pow(n, p):
    x = 0
    for c,v in enumerate(str(n)):
        x+=(int(v)**(p+c))
    return x/n if x%n==0 else -1
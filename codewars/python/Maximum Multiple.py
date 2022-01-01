def max_multiple(divisor, bound):
    new=[i for i in range(1,bound+1) if i%divisor==0]
    return max(new)
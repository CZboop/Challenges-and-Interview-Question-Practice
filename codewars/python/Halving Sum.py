def halving_sum(n): 
    x = n
    sum = 0
    while x >= 1:
        sum+=x
        x= x//2
    return sum
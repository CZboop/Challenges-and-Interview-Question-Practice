def nb_year(p0, percent, aug, p):
    n= p0
    count = 0
    while n < p:
        n = n * (1+(percent/100))
        n += aug
        count += 1
    return count
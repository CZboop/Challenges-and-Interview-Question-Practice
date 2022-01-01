def sum_of_n(n):
    x = []
    if n>=0:
        for i in range(abs(n)+1):
            x.append(sum(range(i+1)))
        return x
    else:
        for i in range(abs(n)+1):
            x.append(-sum(range(i+1)))
        return x
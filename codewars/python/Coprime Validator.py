def are_coprime(n,m):
    factors_n =[]
    factors_m =[]
    for i in range(1,n+1):
        if n%i==0:
            factors_n.append(i)
    for i in range(1,m+1):
        if m%i==0:
            factors_m.append(i)
    shared = []
    for i in factors_n:
        if i in factors_m:
            shared.append(i)
    return len(shared)==1
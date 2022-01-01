def generate_pairs(m, n):
    new = []
    for i in range(m,n+1):
        for j in range(m,n+1):
            new.append((i,j))
    return [i for i in new if i[0]<=i[1]]
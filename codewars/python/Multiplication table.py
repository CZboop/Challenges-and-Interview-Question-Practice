def multiplication_table(size):
    new = []
    for i in range(1,size+1):
        x = [i*j for j in range(1,size+1)]
        new.append(x)
    return new
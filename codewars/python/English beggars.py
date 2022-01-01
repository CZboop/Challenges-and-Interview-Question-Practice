def beggars(values, n):
    lst = []
    for i in range(n):
        lst.append(sum(values[i::n]))
    return lst
def each_cons(lst, n):
    new = []
    for i in range(0, len(lst)):
        new.append(lst[i:i+n])
    return list(i for i in new if len(i)==n)
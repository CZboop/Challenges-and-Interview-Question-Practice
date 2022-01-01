def find_multiples(integer, limit):
    new = []
    for i in range(1,limit+1):
        if i*integer <=limit:
            new.append(i*integer)
    return new
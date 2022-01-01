def unused_digits(*j):
    x = "".join([str(i) for i in [*j]])
    y=""
    for i in "0123456789":
        if i not in x:
            y+=i
    return y
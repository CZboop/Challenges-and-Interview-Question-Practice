def sum_digits(n):
    x = 0
    for i in str(n):
        if i in "123456789":
            x+=int(i)
    return x
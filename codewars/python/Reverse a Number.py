def reverse_number(n):
    if n>=0:
        return int(str(n)[::-1])
    else:
        n = str(n)[1:]
        return 0 - int(n[::-1])
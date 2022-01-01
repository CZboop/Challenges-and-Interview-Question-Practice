def count_bits(n):
    x=format(n,"b")
    count=0
    for i in x:
        count+=int(i)
    return count
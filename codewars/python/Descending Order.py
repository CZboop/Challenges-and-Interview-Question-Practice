def descending_order(num):
    l = []
    for i in str(num):
        l.append(i)
    l = sorted(l, reverse=True)
    strng = "".join(l)
    return int(strng)
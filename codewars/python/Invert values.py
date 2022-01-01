def invert(lst):
    for count,val in enumerate(lst):
        lst[count] = 0-val
    return lst
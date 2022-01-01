def count(array):
    d = {}
    for i in array:
        d[i]= array.count(i)
    return d
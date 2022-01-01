def count(string):
    d = {}
    for c, val in enumerate(string):
        d[val] = string.count(val)
    return d
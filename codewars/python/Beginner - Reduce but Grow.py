def grow(arr):
    sted = sorted(arr)
    result = 1
    for i in sted:
        result = result*i
    return result
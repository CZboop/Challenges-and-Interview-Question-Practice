def highest_rank(arr):
    x = max(arr.count(i) for i in arr)
    y = []
    for i in arr:
        if arr.count(i)==x:
            y.append(i)
    return max(y)
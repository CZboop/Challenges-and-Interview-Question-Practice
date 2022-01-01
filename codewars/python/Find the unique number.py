def find_uniq(x):
    x = sorted(x)
    if min(x)!=x[1]:
        return min(x)
    else:
        return max(x)
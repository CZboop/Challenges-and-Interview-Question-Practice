def high(x):
    a= x.split(" ")
    counts = []
    for i in a:
        counts.append(sum((ord(j)-96)for j in i))
    return a[counts.index(max(counts))]
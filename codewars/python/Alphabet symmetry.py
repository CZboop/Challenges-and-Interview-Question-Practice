def solve(arr):
    arr = [i.lower() for i in arr]
    counts = []
    for i in arr:
        count = 0
        for c,v in enumerate(i):
            if ord(v)-96==c+1:
                count+=1
        counts.append(count)
    return counts
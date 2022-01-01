def averages(arr):
    if arr==None:
        return []
    else:
        new = []
        for c,v in enumerate(arr[:-1]):
            new.append((arr[c]+arr[c+1])/2)
        return new
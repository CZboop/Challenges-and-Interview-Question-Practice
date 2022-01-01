def next_id(arr):
    x = 0
    try:
        if max(arr)==0:
            return 1
        else:
            for i in range(0,max(arr)+1):
                if i not in arr:
                    return i
            return int(max(arr))+1
    except:
        return 0
def find_longest(arr):
    x = ""
    for i in arr:
        if len(str(i))>len(str(x)):
            x= i
    return x
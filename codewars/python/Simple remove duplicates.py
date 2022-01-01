def solve(arr): 
    x = []
    for i in arr[::-1]:
        if i not in x:
            x.append(i)
    return x[::-1]
def fist_beard(arr): 
    x = ""
    for i in arr:
        for j in i:
            x+=chr(j)
    return x
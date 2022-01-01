def well(arr):
    arr = [j.lower() for i in arr for j in i if isinstance(j,str)]
    good = arr.count("good")
    if good>2:
        return "I smell a series!"
    elif good>0:
        return "Publish!"
    else:
        return "Fail!"
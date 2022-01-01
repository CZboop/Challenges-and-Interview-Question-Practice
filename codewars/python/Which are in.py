def in_array(array1, array2):
    x = "".join(array2)
    new=[]
    for i in array1:
        if i in x:
            if i not in new:
                new.append(i)
    return sorted(new)
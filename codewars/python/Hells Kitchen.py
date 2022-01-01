def gordon(a):
    for i in "eiouEIOU":
        a = a.replace(i,"*")
    return a.replace("a","@").replace("A","@").upper().replace(" ","!!!! ")+"!!!!"
def trim(beard):
    beards = []
    for i in beard[:-1]:
        new=[]
        for j in i:
            new.append(j.replace("J","|"))
        beards.append(new)
    new=[]
    for i in beard[-1]: 
        new.append(i.replace(i,"..."))
    beards.append(new)
    return beards
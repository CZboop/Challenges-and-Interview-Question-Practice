def is_divisible_by_6(string):
    x = []
    for i in range(string.count("*")):
        x = [i for j in x for i in j]
        if len(x)==0:
            x.append([string.replace("*",i,1) for i in "0123456789"])
        else:
            x.append([j.replace("*",i,1) for i in "0123456789" for j in x])
    x = [i for j in x for i in j if "*" not in i]
    new = []
    for i in x:
        if int(i)%6==0 and len(i)==len(string):
            new.append(str(i))
    return sorted(new)
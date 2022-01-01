def doubleton(num):
    num+=1
    while len(set(str(num)))!=2:
        num+=1
    return num
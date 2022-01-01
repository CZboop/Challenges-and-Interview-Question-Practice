def points(games):
    total=0
    for i in games:
        if i[0]>i[-1]:
            total+=3
        elif i[0]==i[-1]:
            total+=1
        else:
            continue
    return total
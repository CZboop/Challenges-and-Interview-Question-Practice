def paint_letterboxes(start, finish):
    new=[]
    x = list(range(start,finish+1))
    y = "".join(str(i) for i in x)
    for i in range(0,10):
        new.append(y.count(str(i)))
    return list(new)
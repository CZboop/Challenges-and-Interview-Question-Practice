def solution(a):
    new = []
    
    for i in a:
        x = "{0:b}".format(i)
        if len(x)<8:
            y = "{}".format("0"*(8-len(x)))+x
            new.append(y)
        else:
            new.append(x)

    M = "".join(new[::-1])

    return int(M, 2)

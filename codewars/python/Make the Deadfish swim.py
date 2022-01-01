def parse(data):
    x = []
    val = 0
    for i in data:
        if i=="i":
            val+=1
        if i=="d":
            val-=1
        if i=="s":
            val**=2
        if i=="o":
            x.append(val)
    return x
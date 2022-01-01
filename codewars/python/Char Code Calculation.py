def calc(x):
    total1 = "".join([str(ord(i)) for i in x])
    y = total1.count("7")
    total2 = "".join([i for i in total1 if i!="7"])+("{}".format("1"*y))
    sum1 = sum([int(i) for i in total1])
    sum2 = sum([int(i) for i in total2])
    return abs(sum1-sum2)
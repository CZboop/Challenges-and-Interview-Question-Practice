def parts_sums(ls):
    new = [sum(ls)]
    for i in range(len(ls)):
        new.append(new[-1]-ls[i])
    return new
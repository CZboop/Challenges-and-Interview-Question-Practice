def most_money(students):
    d= {}
    for i in students:
        d[i.name]=i.fives*5+i.tens*10+i.twenties*20
    x = d.get(next(iter(d)))
    if all(i==x for i in d.values()) and len(students)>1:
        return "all"
    else:
        return max(d, key=d.get)
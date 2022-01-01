def pythagorean_triple(integers):
    x = integers.index(max(integers))
    l= [ i for i in integers]
    l.remove(max(l))
    return integers[x]**2==l[0]**2+l[1]**2
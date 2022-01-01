def some_but_not_all(seq, pred): 
    x = [pred(i) for i in seq]
    return 0<x.count(True)<len(x)
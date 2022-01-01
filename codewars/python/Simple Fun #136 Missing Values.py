def missing_values(seq): 
    x=0
    y=0
    for i in seq:
        if seq.count(i)==1:
            x = i
        if seq.count(i)==2:
            y = i
    return x*x*y
def split_the_bill(x):
    avg = sum(x.values())/len(x)
    d= x.copy()
    for key,value in d.items():
        d[key]= round(value-avg,2)
    return d 
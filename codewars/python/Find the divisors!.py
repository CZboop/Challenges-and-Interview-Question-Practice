def divisors(i):
    new=[]
    for x in range(2,i):
        if i%x==0:
            new.append(x)
    return new if len(new)>0 else "{} is prime".format(i)
def tower_builder(n):
    c=[]
    for i in range(n):
        x=2*(i+1)-1
        w=n*2-1
        q= "{}{}{}".format(" "*int((w-x)/2),"*"*x ," "*int((w-x)/2))
        c.append(q)
    return c
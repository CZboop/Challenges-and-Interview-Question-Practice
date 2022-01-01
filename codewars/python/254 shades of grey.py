def shades_of_grey(n):
    if n<1:
        return []
    elif n>254:
        return ["#{}{}{}".format(hex(i).replace("x","") if len(hex(i))==3 else hex(i)[2:],hex(i).replace("x","") if len(hex(i))==3 else hex(i)[2:],hex(i).replace("x","") if len(hex(i))==3 else hex(i)[2:]) for i in range(1,255)]
    else:
        return ["#{}{}{}".format(hex(i).replace("x","") if len(hex(i))==3 else hex(i)[2:],hex(i).replace("x","") if len(hex(i))==3 else hex(i)[2:],hex(i).replace("x","") if len(hex(i))==3 else hex(i)[2:]) for i in range(1,n+1)]
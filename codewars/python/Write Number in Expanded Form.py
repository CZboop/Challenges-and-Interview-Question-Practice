def expanded_form(num):
    new = []
    for c,v in enumerate(str(num)):
        new.append(str(v)+"0"*(len(str(num)[c:])-1))
    newer = []
    for i in new:
        if i[0]=="0":
            pass
        else:
            newer.append(i)
    return " + ".join(newer)
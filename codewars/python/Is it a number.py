def isDigit(st):
    b=[]
    try:
        i = int(st)
    except:
        b.append(False)
    try:
        f = float(st)
    except:
        b.append(False)
    return True if len(b)<2 else False
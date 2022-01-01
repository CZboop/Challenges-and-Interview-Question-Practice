def connotation(strng):
    pos = 0
    neg = 0
    for i in strng.lower().split(" "):
        try:
            if ord(i[0])<=109:
                pos+=1
            else:
                neg+=1
        except:
            pass
    return pos>=neg
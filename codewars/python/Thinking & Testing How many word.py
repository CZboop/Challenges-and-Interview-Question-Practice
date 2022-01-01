def testit(s):
    s = s.lower()
    new = ""
    count = 0
    for i in s:
        if i=="w" and new=="":
            new+="w"
        if i=="o" and new=="w":
            new+="o"
        if i=="r" and new=="wo":
            new+="r"
        if i=="d" and new=="wor":
            new=""
            count+=1
    return count
def present(x,y):
    if x=="goodpresent":
        new = ""
        for i in x:
            new+=chr(ord(i)+y)
        return new
    if x=="crap" or x=="empty":
        return "".join(sorted(x))
    if x=="badpresent":
        return "Take this back!"
    if x=="dog":
        return "pass out from excitement {} times".format(y)
    if x=="bang":
        new = []
        for i in x:
            new.append(ord(i)-y)
        return str(sum(new))
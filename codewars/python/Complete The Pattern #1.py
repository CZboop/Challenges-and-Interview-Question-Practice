def pattern(n):
    if n<1:
        return ""
    else:
        new =""
        for i in range(1,n+1):
            new+="{}\n".format(str(i)*i)
        return new.strip("\n")
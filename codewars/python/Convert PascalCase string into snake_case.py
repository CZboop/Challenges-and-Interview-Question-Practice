def to_underscore(string):
    x = ""
    for c,v in enumerate(str(string)[:-1]):
        if string[c+1].isupper():
            x+=v.lower()+"_"
        else:
            x+=v.lower()
    x+=str(string)[-1]
    return x
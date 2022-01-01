def string_transformer(s):
    x = ""
    for i in s:
        if i.islower()==True:
            x+=i.upper()
        else:
            x+=i.lower()
    return " ".join(x.split(" ")[::-1])
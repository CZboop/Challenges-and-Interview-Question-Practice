def string_clean(s):
    n="1234567890"
    y=s
    for i in n:
        y=y.replace(i,"")
    return y
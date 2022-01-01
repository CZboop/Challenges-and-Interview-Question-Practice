def capitalize(s):
    x = ""
    for c,v in enumerate(s):
        if c%2==0:
            x+=v.lower()
        else:
            x+=v.upper()
    return [x.swapcase(),x]
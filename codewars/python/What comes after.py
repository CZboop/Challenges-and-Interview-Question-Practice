def comes_after(st, l): 
    new = ""
    for c,v in enumerate(st[:-1]):
        if v==l.lower() and st[c+1].isalpha():
            new+=st[c+1]
        if v==l.upper() and st[c+1].isalpha():
            new+=st[c+1]
    return new
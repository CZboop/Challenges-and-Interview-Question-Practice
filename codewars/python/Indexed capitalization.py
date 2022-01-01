def capitalize(s,ind):
    new = ""
    for c,v in enumerate(s):
        if c in ind:
            new+=v.upper()
        else:
            new+=v
    return new
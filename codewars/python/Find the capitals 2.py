def capitals(word):
    new = []
    for c,v in enumerate(word):
        if v.isupper():
            new.append(c)
    return new
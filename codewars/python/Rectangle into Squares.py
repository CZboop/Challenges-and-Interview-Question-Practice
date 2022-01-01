def sqInRect(l, w):
    if w==l:
        return None
    new = []
    while l>=1 and w>=1:
        if l>w:
            new.append(w)
            l-=w
        else:
            new.append(l)
            w-=l
    return new
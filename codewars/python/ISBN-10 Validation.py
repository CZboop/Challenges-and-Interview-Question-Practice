def valid_ISBN10(isbn): 
    x = 0
    if any(i.isalpha() for i in isbn[:-1]):
        return False
    for c,v in enumerate(isbn):
        if v.isnumeric():
            x+=(c+1)*int(v)
    if isbn[-1]=="X":
        x+=100
    return x%11==0 and len(isbn)==10
def cool_string(s): 
    if any(i.isnumeric() for i in s) or s.count(" ")>0:
        return False
    for c,v in enumerate(s[:-1]):
        if v.islower() and s[c+1].islower():
            return False
        if v.isupper() and s[c+1].isupper():
            return False
    return True
def letter_count(s):
    d={}
    for i in set(s):
        d[i]=s.count(i)
    return d
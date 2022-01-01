def two_are_positive(a, b, c):
    count = 0
    if a>0:
        count+=1
    if b>0:
        count+=1
    if c>0:
        count+=1
    return count==2
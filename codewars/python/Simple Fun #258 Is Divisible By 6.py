def is_divisible_by_6(s):
    x = [s.replace("*",i) for i in "0123456789"]
    new = []
    for i in x:
        if int(i)%6==0:
            new.append(str(int(i)))
    return new
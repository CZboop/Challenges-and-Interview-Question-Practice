def baby_count(x):
    x = x.lower()
    r = [x.count(i) for i in "ay"]
    y = x.count("b")//2
    if min(y,min(r))>0:
        return min(y,min(r))
    else:
        return "Where's the baby?!"
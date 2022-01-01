def score_throws(radii):
    sc = 0
    for i in radii:
        if i<5:
            sc+=10
        elif i<=10:
            sc+=5
        elif i>10:
            sc+=0
    if all(i<5 for i in radii) and len(radii)>0:
        sc+=100
    return sc
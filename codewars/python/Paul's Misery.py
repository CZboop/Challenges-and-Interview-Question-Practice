def paul(x):
    count = 0
    for i in x:
        if i=="kata":
            count+=5
        if i=="Petes kata":
            count+=10
        if i=="eating":
            count+=1
    if count<40:
        return "Super happy!"
    if 100>count>=70:
        return "Sad!"
    if 70>count>=40:
        return "Happy!"
    elif count>=100:
        return "Miserable!"
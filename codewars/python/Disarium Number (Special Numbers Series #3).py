def disarium_number(number):
    x=0
    for c,v in enumerate(str(number)):
        x+=int(v)**(c+1)
    if x==number:
        return "Disarium !!"
    else:
        return "Not !!"
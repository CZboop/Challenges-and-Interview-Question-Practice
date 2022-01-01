def price(start, soil, age):
    d = {"Barely used":1.1,"Seen a few high kicks":1.25,"Blood stained":1.3,"Heavily soiled":1.5}
    try:
        x = d.get(soil)
        for i in range(age):
            start*=x
        return "${:.2f}".format(round(start,2))
    except:
        return "Chuck is bottomless!"
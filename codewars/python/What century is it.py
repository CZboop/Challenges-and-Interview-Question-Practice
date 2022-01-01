def what_century(year):
    d = {"1":"st","2":"nd","3":"rd"}
    y = str(int(year)//100+1)
    if year[-2:]=="00":
        if year[-3] in "123":
            return "{}{}".format((int(year)//100), d.get(str(int(y[-1])-1), "th"))
        else:
            return "{}{}".format((int(year)//100),"th")
    else:
        if y in ["11","12","13"]:
            return "{}{}".format((int(year)//100)+1, "th")
        else:
            return "{}{}".format((int(year)//100)+1, d.get(y[-1], "th"))
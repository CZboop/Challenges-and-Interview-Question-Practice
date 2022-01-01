def number_to_ordinal(n):
    d = {"1":"st","2":"nd","3":"rd"}
    if n==0:
        return "0"
    if len(str(n))==1:
        return str(n)+"{}".format(d.get(str(n),"th"))
    else:
        try:
            if str(n)[-2:] in ["11","12","13"]:
                return str(n)+"th"
            else:
                return str(n)+"{}".format(d.get(str(n)[-1],"th"))
        except:
            return str(n)+"{}".format(d.get(str(n)[-1],"th"))
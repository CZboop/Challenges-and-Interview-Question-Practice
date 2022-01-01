def calories(string):
    x = int(string.split(" ")[0])
    y = string.split(" ")[1]
    if y.lower()=="j":
        return round(x/4.184)
    elif y.lower()=="kj":
        return round(x/0.004184)
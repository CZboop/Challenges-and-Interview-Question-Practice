def get_decimal(n): 
    try:
        x = str(n).split(".")[1]
        return float("0.{}".format(x))
    except:
        return 0
def commas(num):
    if round(num)==num:
        return "{:,}".format(round(num))
    else:
        x= "{:,}".format(round(num,3))
        if ".0" in x and x.endswith("0"):
            return x[:x.index(".")]
        else:
            return x
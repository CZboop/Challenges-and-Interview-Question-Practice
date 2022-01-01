def meeting(s):
    s = s.upper()
    x = s.split(";")
    x = [i.split(":") for i in x]
    y = sorted([", ".join(i[::-1]) for i in x])
    y = ["({})".format(i) for i in y]
    return "".join(y)
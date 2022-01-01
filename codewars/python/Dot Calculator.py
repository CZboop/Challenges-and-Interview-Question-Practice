def calculator(txt):
    x = txt.split(" ")
    op = x[1]
    if op=="+":
        return "{}".format((len(x[0])+len(x[2]))*".")
    if op=="-":
        return "{}".format((len(x[0])-len(x[2]))*".")
    if op=="*":
        return "{}".format((len(x[0])*len(x[2]))*".")
    if op=="//":
        return "{}".format((len(x[0])//len(x[2]))*".")
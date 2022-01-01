def valid_number(n):
    try:
        x = len(n.split(".")[1])==2
    except:
        x = False
    y = n.count(".")==1
    z = all(i.isdigit() for i in "".join(n.split(".")).strip("-+"))
    return x and y and z
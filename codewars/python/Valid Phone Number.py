def validPhoneNumber(p):
    x = len(p)==14
    y = p[0]=="(" and p[4]==")" and p[5]==" " and p[9]=="-"
    return x and y
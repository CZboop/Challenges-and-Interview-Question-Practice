def sum_str(a, b):
    if len(a)>0 and len(b)>0:
        return str(int(a)+int(b))
    elif len(a)==0 and len(b)>0:
        return str(0+int(b))
    elif len(a)>0 and len(b)==0:
        return str(int(a)+0)
    else:
        return "0"
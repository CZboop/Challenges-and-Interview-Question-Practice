def balanced_num(number):
    number = str(number)
    mid_o = int(abs(len(number)/2))
    mid_e =int(len(number)/2)
    one_o= [int(i) for i in number[:mid_o]]
    two_o= [int(i) for i in number[mid_o+1:]]
    one_e= [int(i) for i in number[:mid_e-1]]
    two_e= [int(i) for i in number[mid_e+1:]]
    if len(number)<=2:
        return "Balanced"
    elif len(number)%2!=0:
        if sum(one_o)==sum(two_o):
            return "Balanced"
        else:
            return "Not Balanced"
    elif len(number)%2==0:
        if sum(one_e)==sum(two_e):
            return "Balanced"
        else:
            return "Not Balanced"
    else:
        return "Not Balanced"
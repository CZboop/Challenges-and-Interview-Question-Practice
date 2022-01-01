import math
def olympic_ring(string):
    count = 0
    for i in string:
        if i in "ADOPQRabdegopq":
            count+=1
        elif i=="B":
            count+=2
    count = math.floor(count/2)
    if count<=1:
        return "Not even a medal!"
    elif count==2:
        return "Bronze!"
    elif count==3:
        return "Silver!"
    else:
        return "Gold!"
import math
def waterbombs(fire, w):
    x = fire.split("Y")
    count = 0
    for i in x:
        count+=math.ceil(len(i)/w)
    return count
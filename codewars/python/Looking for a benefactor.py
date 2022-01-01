import math
def new_avg(arr, newavg):
    x = math.ceil(newavg*(len(arr)+1) - sum(arr))
    if x>=0:
        return x
    else:
        raise Error
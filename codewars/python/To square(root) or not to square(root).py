import math
def square_or_square_root(arr):
    new = []
    for i in arr:
        if math.isqrt(i)**2==i:
            new.append(math.isqrt(i))
        else:
            new.append(i**2)
    return new
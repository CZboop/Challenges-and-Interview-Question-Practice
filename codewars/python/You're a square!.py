import math
def is_square(n): 
    if n<0:
        return False
    elif n==0:
        return True
    else:
        x = math.sqrt(n)
        return n == int(x + 0.5) ** 2
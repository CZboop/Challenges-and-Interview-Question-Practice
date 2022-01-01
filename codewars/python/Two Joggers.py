from math import gcd
def nbr_of_laps(x, y):
    z = abs(x*y) // gcd(x,y)
    return (z/x, z/y)
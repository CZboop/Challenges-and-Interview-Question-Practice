import math

def century(year):
    if str(year).endswith("00"):
        return year/100
    else:
        return math.floor(year/100)+1
import math
def predict_age(a1, a2, a3, a4, a5, a6, a7, a8):
    x = sum(i**2 for i in [a1,a2,a3,a4,a5,a6,a7,a8])
    return math.floor(math.sqrt(x)/2)
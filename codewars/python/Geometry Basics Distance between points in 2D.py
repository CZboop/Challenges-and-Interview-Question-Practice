import math
def distance_between_points(a, b):
    x = abs(a.x-b.x)
    y = abs(a.y-b.y)
    return math.sqrt(x**2+y**2)
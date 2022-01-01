import math
def shortest_distance(a, b, c):
    x = sorted([a,b,c])
    return math.sqrt(((x[1]+x[0])**2)+(x[2]**2))
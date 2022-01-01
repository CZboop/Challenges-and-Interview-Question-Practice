import math
def circle_diameter(sides, side_length): 
    rad = side_length/(2*math.tan(math.pi/sides))
    return rad*2
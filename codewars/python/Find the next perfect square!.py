import math
def find_next_square(sq):
    root = int(math.sqrt(sq))
    return (root+1)**2 if root*root==sq else -1
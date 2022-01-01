import math
def get_participants(handshakes):
    return math.ceil((-1+math.sqrt(1+8*handshakes))/2+1)
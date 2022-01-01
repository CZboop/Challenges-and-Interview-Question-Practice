import time
def dice(minimum, maximum):
    x = time.time()
    y = int(str(x)[-len(str(maximum)):])
    if minimum < y < maximum:
        return y
    else:
        while y>maximum:
            y = y-int(str(time.time())[-1:])
        while y<minimum:
            y = y+int(str(time.time())[-1:])
        return y
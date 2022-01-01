def find_squares(num):
    x = (num+1)/2
    return "{}-{}".format(int(x**2), int((x-num)**2))
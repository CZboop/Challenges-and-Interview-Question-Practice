def make_readable(seconds):
    h = seconds//3600
    m = seconds%3600//60
    s = seconds%3600%60
    x = "{:02}:{:02}:{:02}".format(h,m,s)
    return x
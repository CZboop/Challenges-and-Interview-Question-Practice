def to_time(seconds):
    hours = seconds//3600
    minutes = (seconds%3600)//60
    return "{} hour(s) and {} minute(s)".format(hours, minutes)
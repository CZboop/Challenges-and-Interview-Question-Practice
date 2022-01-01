import datetime
def period_is_late(last,today,cycle_length):
    diff = today-last
    return diff > datetime.timedelta(cycle_length)
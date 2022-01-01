def is_golden(x, y):
    if round(max(x,y) / min(x,y), 3) == 1.618:
        return True
    else:
        return False
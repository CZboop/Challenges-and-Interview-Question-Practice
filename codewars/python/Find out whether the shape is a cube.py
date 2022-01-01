def cube_checker(volume, side):
    if volume>0 and side>0:
        return volume==side**3
    return False
def bareable(heat, humidity):
    if humidity >0.5 or heat>=36:
        return False
    elif 25<heat<36 and humidity>0.4:
        return False
    else:
        return True
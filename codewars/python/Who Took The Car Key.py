def who_took_the_car_key(message):
    return "".join((chr(int(i, 2)) for i in message))